/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testingallprocedurescenarios.sample2.Inventory;

/**
 * Service object for domain model class {@link Inventory}.
 */
public interface InventoryService {

    /**
     * Creates a new Inventory. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Inventory if any.
     *
     * @param inventory Details of the Inventory to be created; value cannot be null.
     * @return The newly created Inventory.
     */
    Inventory create(@Valid Inventory inventory);


	/**
     * Returns Inventory by given id if exists.
     *
     * @param inventoryId The id of the Inventory to get; value cannot be null.
     * @return Inventory associated with the given inventoryId.
	 * @throws EntityNotFoundException If no Inventory is found.
     */
    Inventory getById(String inventoryId);

    /**
     * Find and return the Inventory by given id if exists, returns null otherwise.
     *
     * @param inventoryId The id of the Inventory to get; value cannot be null.
     * @return Inventory associated with the given inventoryId.
     */
    Inventory findById(String inventoryId);

	/**
     * Find and return the list of Inventories by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param inventoryIds The id's of the Inventory to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Inventories associated with the given inventoryIds.
     */
    List<Inventory> findByMultipleIds(List<String> inventoryIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Inventory. It replaces all fields of the existing Inventory with the given inventory.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Inventory if any.
     *
     * @param inventory The details of the Inventory to be updated; value cannot be null.
     * @return The updated Inventory.
     * @throws EntityNotFoundException if no Inventory is found with given input.
     */
    Inventory update(@Valid Inventory inventory);


    /**
     * Partially updates the details of an existing Inventory. It updates only the
     * fields of the existing Inventory which are passed in the inventoryPatch.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Inventory if any.
     *
     * @param inventoryId The id of the Inventory to be deleted; value cannot be null.
     * @param inventoryPatch The partial data of Inventory which is supposed to be updated; value cannot be null.
     * @return The updated Inventory.
     * @throws EntityNotFoundException if no Inventory is found with given input.
     */
    Inventory partialUpdate(String inventoryId, Map<String, Object> inventoryPatch);

    /**
     * Deletes an existing Inventory with the given id.
     *
     * @param inventoryId The id of the Inventory to be deleted; value cannot be null.
     * @return The deleted Inventory.
     * @throws EntityNotFoundException if no Inventory found with the given id.
     */
    Inventory delete(String inventoryId);

    /**
     * Deletes an existing Inventory with the given object.
     *
     * @param inventory The instance of the Inventory to be deleted; value cannot be null.
     */
    void delete(Inventory inventory);

    /**
     * Find all Inventories matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Inventories.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Inventory> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Inventories matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Inventories.
     *
     * @see Pageable
     * @see Page
     */
    Page<Inventory> findAll(String query, Pageable pageable);

    /**
     * Exports all Inventories matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
     */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

    /**
     * Exports all Inventories matching the given input query to the given exportType format.
     *
     * @param options The export options provided by the user; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @param outputStream The output stream of the file for the exported data to be written to.
     *
     * @see DataExportOptions
     * @see Pageable
     * @see OutputStream
     */
    void export(DataExportOptions options, Pageable pageable, OutputStream outputStream);

    /**
     * Retrieve the count of the Inventories in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Inventory.
     */
    long count(String query);

    /**
     * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return Paginated data with included fields.
     *
     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
    Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}