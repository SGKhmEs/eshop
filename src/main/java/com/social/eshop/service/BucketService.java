package com.social.eshop.service;

import com.social.eshop.service.dto.BucketDTO;
import java.util.List;

/**
 * Service Interface for managing Bucket.
 */
public interface BucketService {

    /**
     * Save a bucket.
     *
     * @param bucketDTO the entity to save
     * @return the persisted entity
     */
    BucketDTO save(BucketDTO bucketDTO);

    /**
     *  Get all the buckets.
     *  
     *  @return the list of entities
     */
    List<BucketDTO> findAll();

    /**
     *  Get the "id" bucket.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    BucketDTO findOne(Long id);

    /**
     *  Delete the "id" bucket.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Search for the bucket corresponding to the query.
     *
     *  @param query the query of the search
     *  
     *  @return the list of entities
     */
    List<BucketDTO> search(String query);
}
