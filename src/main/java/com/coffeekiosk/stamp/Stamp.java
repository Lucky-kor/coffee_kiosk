package com.coffeekiosk.stamp;

import com.coffeekiosk.member.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Stamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stampId;

    @Column(nullable = false)
    private int stampCount;

    @OneToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

}
