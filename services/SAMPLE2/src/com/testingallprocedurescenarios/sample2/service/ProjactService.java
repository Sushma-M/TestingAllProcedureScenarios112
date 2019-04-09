/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.sql.Date;
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

import com.testingallprocedurescenarios.sample2.Empprojact;
import com.testingallprocedurescenarios.sample2.Projact;
import com.testingallprocedurescenarios.sample2.ProjactId;

/**
 * Service object for domain model class {@link Projact}.
 */
public interface ProjactService {

    /**
     * Creates a new Projact. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Projact if any.
     *
     * @param projact Details of the Projact to be created; value cannot be null.
     * @return The newly created Projact.
     */
    Projact create(@Valid Projact projact);


	/**
     * Returns Projact by given id if exists.
     *
     * @param projactId The id of the Projact to get; value cannot be null.
     * @return Projact associated with the given projactId.
	 * @throws EntityNotFoundException If no Projact is found.
     */
    Projact getById(ProjactId projactId);

    /**
     * Find and return the Projact by given id if exists, returns null otherwise.
     *
     * @param projactId The id of the Projact to get; value cannot be null.
     * @return Projact associated with the given projactId.
     */
    Projact findById(ProjactId projactId);

	/**
     * Find and return the list of Projacts by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param projactIds The id's of the Projact to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Projacts associated with the given projactIds.
     */
    List<Projact> findByMultipleIds(List<ProjactId> projactIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Projact. It replaces all fields of the existing Projact with the given projact.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Projact if any.
     *
     * @param projact The details of the Projact to be updated; value cannot be null.
     * @return The updated Projact.
     * @throws EntityNotFoundException if no Projact is found with given input.
     */
    Projact update(@Valid Projact projact);

    /**
     * Deletes an existing Projact with the given id.
     *
     * @param projactId The id of the Projact to be deleted; value cannot be null.
     * @return The deleted Projact.
     * @throws EntityNotFoundException if no Projact found with the given id.
     */
    Projact delete(ProjactId projactId);

    /**
     * Deletes an existing Projact with the given object.
     *
     * @param projact The instance of the Projact to be deleted; value cannot be null.
     */
    void delete(Projact projact);

    /**
     * Find all Projacts matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Projacts.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Projact> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Projacts matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Projacts.
     *
     * @see Pageable
     * @see Page
     */
    Page<Projact> findAll(String query, Pageable pageable);

    /**
     * Exports all Projacts matching the given input query to the given exportType format.
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
     * Exports all Projacts matching the given input query to the given exportType format.
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
     * Retrieve the count of the Projacts in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Projact.
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

    /*
     * Returns the associated empprojacts for given Projact id.
     *
     * @param actno value of actno; value cannot be null
     * @param projno value of projno; value cannot be null
     * @param acstdate value of acstdate; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated Empprojact instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<Empprojact> findAssociatedEmpprojacts(Short actno, String projno, Date acstdate, Pageable pageable);

}