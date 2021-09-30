package org.chameera.blockchain;

import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.*;

class BlockTest {

    @Test
    void testCalculateHash() {
        Timestamp timestamp = new Timestamp(2021, 9, 30, 10, 30, 0, 0);
        Block block = new Block("0", "Test data", timestamp.getTime());
        block.calculateHash();
        assertNotNull(block.getHash());
    }
}