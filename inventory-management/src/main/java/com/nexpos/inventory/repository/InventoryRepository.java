package com.nexpos.inventory.repository;

import com.nexpos.inventory.model.InventoryItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<InventoryItem, String> {
}
