package org.koreait.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter @ToString
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BasicSubEntity extends BasicEntity {

    @CreatedBy
    @Column(updatable = false)
    private Long creatorNo;

    @LastModifiedBy
    @Column(insertable = false)
    private Long modifierNo;

}
