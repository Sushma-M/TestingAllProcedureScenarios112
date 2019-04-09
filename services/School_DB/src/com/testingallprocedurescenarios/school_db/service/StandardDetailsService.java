/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db.service;

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

import com.testingallprocedurescenarios.school_db.Academics;
import com.testingallprocedurescenarios.school_db.StandardDetails;

/**
 * Service object for domain model class {@link StandardDetails}.
 */
public interface StandardDetailsService {

    /**
     * Creates a new StandardDetails. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on StandardDetails if any.
     *
     * @param standardDetails Details of the StandardDetails to be created; value cannot be null.
     * @return The newly created StandardDetails.
     */
    StandardDetails create(@Valid StandardDetails standardDetails);


	/**
     * Returns StandardDetails by given id if exists.
     *
     * @param standarddetailsId The id of the StandardDetails to get; value cannot be null.
     * @return StandardDetails associated with the given standarddetailsId.
	 * @throws EntityNotFoundException If no StandardDetails is found.
     */
    StandardDetails getById(Integer standarddetailsId);

    /**
     * Find and return the StandardDetails by given id if exists, returns null otherwise.
     *
     * @param standarddetailsId The id of the StandardDetails to get; value cannot be null.
     * @return StandardDetails associated with the given standarddetailsId.
     */
    StandardDetails findById(Integer standarddetailsId);

	/**
     * Find and return the list of StandardDetails by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param standarddetailsIds The id's of the StandardDetails to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return StandardDetails associated with the given standarddetailsIds.
     */
    List<StandardDetails> findByMultipleIds(List<Integer> standarddetailsIds, boolean orderedReturn);

    /**
     * Find and return the StandardDetails for given standardCode  if exists.
     *
     * @param standardCode value of standardCode; value cannot be null.
     * @return StandardDetails associated with the given inputs.
     * @throws EntityNotFoundException if no matching StandardDetails found.
     */
    StandardDetails getByStandardCode(String standardCode);

    /**
     * Updates the details of an existing StandardDetails. It replaces all fields of the existing StandardDetails with the given standardDetails.
     *
     * This method overrides the input field values using Server side or database managed properties defined on StandardDetails if any.
     *
     * @param standardDetails The details of the StandardDetails to be updated; value cannot be null.
     * @return The updated StandardDetails.
     * @throws EntityNotFoundException if no StandardDetails is found with given input.
     */
    StandardDetails update(@Valid StandardDetails standardDetails);


    /**
     * Partially updates the details of an existing StandardDetails. It updates only the
     * fields of the existing StandardDetails which are passed in the standardDetailsPatch.
     *
     * This method overrides the input field values using Server side or database managed properties defined on StandardDetails if any.
     *
     * @param standarddetailsId The id of the StandardDetails to be deleted; value cannot be null.
     * @param standardDetailsPatch The partial data of StandardDetails which is supposed to be updated; value cannot be null.
     * @return The updated StandardDetails.
     * @throws EntityNotFoundException if no StandardDetails is found with given input.
     */
    StandardDetails partialUpdate(Integer standarddetailsId, Map<String, Object> standardDetailsPatch);

    /**
     * Deletes an existing StandardDetails with the given id.
     *
     * @param standarddetailsId The id of the StandardDetails to be deleted; value cannot be null.
     * @return The deleted StandardDetails.
     * @throws EntityNotFoundException if no StandardDetails found with the given id.
     */
    StandardDetails delete(Integer standarddetailsId);

    /**
     * Deletes an existing StandardDetails with the given object.
     *
     * @param standardDetails The instance of the StandardDetails to be deleted; value cannot be null.
     */
    void delete(StandardDetails standardDetails);

    /**
     * Find all StandardDetails matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching StandardDetails.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<StandardDetails> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all StandardDetails matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching StandardDetails.
     *
     * @see Pageable
     * @see Page
     */
    Page<StandardDetails> findAll(String query, Pageable pageable);

    /**
     * Exports all StandardDetails matching the given input query to the given exportType format.
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
     * Exports all StandardDetails matching the given input query to the given exportType format.
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
     * Retrieve the count of the StandardDetails in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the StandardDetails.
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
     * Returns the associated academicses for given StandardDetails id.
     *
     * @param standardId value of standardId; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated Academics instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<Academics> findAssociatedAcademicses(Integer standardId, Pageable pageable);

}