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

import com.testingallprocedurescenarios.sample2.Suppliers;

/**
 * Service object for domain model class {@link Suppliers}.
 */
public interface SuppliersService {

    /**
     * Creates a new Suppliers. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Suppliers if any.
     *
     * @param suppliers Details of the Suppliers to be created; value cannot be null.
     * @return The newly created Suppliers.
     */
    Suppliers create(@Valid Suppliers suppliers);


	/**
     * Returns Suppliers by given id if exists.
     *
     * @param suppliersId The id of the Suppliers to get; value cannot be null.
     * @return Suppliers associated with the given suppliersId.
	 * @throws EntityNotFoundException If no Suppliers is found.
     */
    Suppliers getById(String suppliersId);

    /**
     * Find and return the Suppliers by given id if exists, returns null otherwise.
     *
     * @param suppliersId The id of the Suppliers to get; value cannot be null.
     * @return Suppliers associated with the given suppliersId.
     */
    Suppliers findById(String suppliersId);

	/**
     * Find and return the list of Suppliers by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param suppliersIds The id's of the Suppliers to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Suppliers associated with the given suppliersIds.
     */
    List<Suppliers> findByMultipleIds(List<String> suppliersIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Suppliers. It replaces all fields of the existing Suppliers with the given suppliers.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Suppliers if any.
     *
     * @param suppliers The details of the Suppliers to be updated; value cannot be null.
     * @return The updated Suppliers.
     * @throws EntityNotFoundException if no Suppliers is found with given input.
     */
    Suppliers update(@Valid Suppliers suppliers);

    /**
     * Deletes an existing Suppliers with the given id.
     *
     * @param suppliersId The id of the Suppliers to be deleted; value cannot be null.
     * @return The deleted Suppliers.
     * @throws EntityNotFoundException if no Suppliers found with the given id.
     */
    Suppliers delete(String suppliersId);

    /**
     * Deletes an existing Suppliers with the given object.
     *
     * @param suppliers The instance of the Suppliers to be deleted; value cannot be null.
     */
    void delete(Suppliers suppliers);

    /**
     * Find all Suppliers matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Suppliers.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Suppliers> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Suppliers matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Suppliers.
     *
     * @see Pageable
     * @see Page
     */
    Page<Suppliers> findAll(String query, Pageable pageable);

    /**
     * Exports all Suppliers matching the given input query to the given exportType format.
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
     * Exports all Suppliers matching the given input query to the given exportType format.
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
     * Retrieve the count of the Suppliers in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Suppliers.
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