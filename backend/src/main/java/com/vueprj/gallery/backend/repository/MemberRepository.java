package com.vueprj.gallery.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vueprj.gallery.backend.entity.Member;


public interface MemberRepository extends JpaRepository<Member, Integer>{
    Member findByEmailAndPassword(String email, String password);
}
