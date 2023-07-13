package com.happy.happytest.chaeyeon;

import com.happy.happytest.UserRepository;
import com.happy.happytest.yezy.entity.UserEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveNew() {
        // given
        String username = "yeoon.dev";
        UserEntity user = new UserEntity();
        user.setUsername(username);

        // when
        user = userRepository.save(user);

        // then
        assertNotNull(user.getId());
        assertEquals(username, user.getUsername());
    }

    @Test
    @DisplayName("새 user 생성 실패")
    public void testSaveNewFail() {
        // given
        String username = "yeoon.dev";
        UserEntity userGiven = new UserEntity();
        userGiven.setUsername(username);
        userGiven = userRepository.save(userGiven);

        // when
        UserEntity user = new UserEntity();
        user.setUsername(username);

        // when-then
        assertThrows(Exception.class, () -> userRepository.save(user));
    }
}
