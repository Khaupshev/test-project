package com.test.project.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.Instant;

/**
 * The type Abstract entity.
 */
@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public abstract class AbstractEntity {

    @CreatedDate
    @Column(updatable = false)
    @Type(type = "java.time.Instant")
    private Instant createdAt;

    @LastModifiedDate
    @Type(type = "java.time.Instant")
    private Instant updatedAt;

}
