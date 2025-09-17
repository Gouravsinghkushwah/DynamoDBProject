package com.dynamoDB.DynamoDBProject.repo;

import com.dynamoDB.DynamoDBProject.entity.User;
import org.springframework.stereotype.Repository;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private final DynamoDbTable<User> userTable;

    public UserRepository(DynamoDbEnhancedClient enhancedClient) {
        this.userTable = enhancedClient.table("Users", TableSchema.fromBean(User.class));
    }

    public void save(User user) {
        userTable.putItem(user);
    }

    public User findById(String userId) {
        return userTable.getItem(r -> r.key(k -> k.partitionValue(userId)));
    }

    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        userTable.scan().items().forEach(list::add);
        return list;
    }

    public void delete(String userId) {
        userTable.deleteItem(r -> r.key(k -> k.partitionValue(userId)));
    }

}
