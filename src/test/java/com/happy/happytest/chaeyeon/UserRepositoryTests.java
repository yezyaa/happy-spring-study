package com.happy.happytest.chaeyeon;

import com.happy.happytest.UserRepository;
import com.happy.happytest.yezy.entity.UserEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

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

    @Test
    @DisplayName("username으로 UserEntity 찾기")
    public void testFindUsername() {
        // given: 검색할 UserEntity 미리 생성
        String username = "yeoon.dev";
        UserEntity userGiven = new UserEntity();
        userGiven.setUsername(username);
        userRepository.save(userGiven);

        // when: userRepository.findByUsername()
        Optional<UserEntity> optionalUser
                = userRepository.findByUsername(username);

        // then: Optional.isPresent(), username == username
        assertTrue(optionalUser.isPresent());
        assertEquals(username, optionalUser.get().getUsername());
    }

    @Test
    @DisplayName("username으로 찾기 실패")
    public void testExistsByUsername() {
        // given
        String usernameExists = "yeoon.dev";
        String usernameExistsNot = "not_found";
        UserEntity userGiven = new UserEntity();
        userGiven.setUsername(usernameExists);
        userRepository.save(userGiven);

        // when
        Boolean exists = userRepository.existsByUsername(usernameExists);
        Boolean existsNot = userRepository.existsByUsername(usernameExistsNot);

        // then
        assertTrue(exists);
        assertFalse(existsNot);
    }

    @Test
    @DisplayName("id로 UserEntity 삭제")
    public void testDeleteById() {
        // given
        String username = "target";
        UserEntity target = new UserEntity();
        target.setUsername(username);
        Long id = userRepository.save(target).getId();

        // when
        userRepository.deleteById(id);

        // then
//        assertTrue(userRepository.existsByUsername(username));
        assertFalse(userRepository.existsByUsername(username));
    }
}
