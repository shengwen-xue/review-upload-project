package com.example.demo.demo;

import com.example.demo.demo.enums.ExceptionEnum;
import com.example.demo.demo.exception.BusinessException;
import com.example.demo.demo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.util.LinkedList;

import static com.example.demo.demo.enums.ExceptionEnum.COLLECTIONS_EMPTY;

/**
 * Create by
 *
 * @author xueshengwen
 */
@Slf4j
public class TestDemo {
    public static void main(String[] args) {
        LinkedList<User> userLinkedList = new LinkedList<>();
        userLinkedList.add(new User(1, "Tom", 22));

        if (CollectionUtils.isEmpty(userLinkedList)) {
            throw new BusinessException(COLLECTIONS_EMPTY.getCode(), COLLECTIONS_EMPTY.getMessage());
        }
        log.info("userLinkedList size : {}", userLinkedList.size());
        userLinkedList.remove();
        if (CollectionUtils.isEmpty(userLinkedList)) {
            throw new BusinessException(ExceptionEnum.COLLECTIONS_EMPTY);
        }
    }
}
