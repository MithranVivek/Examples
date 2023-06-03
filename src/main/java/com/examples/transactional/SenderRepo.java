package com.examples.transactional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SenderRepo extends JpaRepository<Sender, Integer> {

}
