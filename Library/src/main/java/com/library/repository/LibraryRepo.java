package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entity.Library;

public interface LibraryRepo extends JpaRepository<Library, Long> {

}
