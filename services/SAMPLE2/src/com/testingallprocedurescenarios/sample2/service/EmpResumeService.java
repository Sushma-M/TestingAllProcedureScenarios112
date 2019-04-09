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

import com.testingallprocedurescenarios.sample2.EmpResume;
import com.testingallprocedurescenarios.sample2.EmpResumeId;

/**
 * Service object for domain model class {@link EmpResume}.
 */
public interface EmpResumeService {

    /**
     * Creates a new EmpResume. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on EmpResume if any.
     *
     * @param empResume Details of the EmpResume to be created; value cannot be null.
     * @return The newly created EmpResume.
     */
    EmpResume create(@Valid EmpResume empResume);


	/**
     * Returns EmpResume by given id if exists.
     *
     * @param empresumeId The id of the EmpResume to get; value cannot be null.
     * @return EmpResume associated with the given empresumeId.
	 * @throws EntityNotFoundException If no EmpResume is found.
     */
    EmpResume getById(EmpResumeId empresumeId);

    /**
     * Find and return the EmpResume by given id if exists, returns null otherwise.
     *
     * @param empresumeId The id of the EmpResume to get; value cannot be null.
     * @return EmpResume associated with the given empresumeId.
     */
    EmpResume findById(EmpResumeId empresumeId);

	/**
     * Find and return the list of EmpResumes by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param empresumeIds The id's of the EmpResume to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return EmpResumes associated with the given empresumeIds.
     */
    List<EmpResume> findByMultipleIds(List<EmpResumeId> empresumeIds, boolean orderedReturn);


    /**
     * Updates the details of an existing EmpResume. It replaces all fields of the existing EmpResume with the given empResume.
     *
     * This method overrides the input field values using Server side or database managed properties defined on EmpResume if any.
     *
     * @param empResume The details of the EmpResume to be updated; value cannot be null.
     * @return The updated EmpResume.
     * @throws EntityNotFoundException if no EmpResume is found with given input.
     */
    EmpResume update(@Valid EmpResume empResume);

    /**
     * Deletes an existing EmpResume with the given id.
     *
     * @param empresumeId The id of the EmpResume to be deleted; value cannot be null.
     * @return The deleted EmpResume.
     * @throws EntityNotFoundException if no EmpResume found with the given id.
     */
    EmpResume delete(EmpResumeId empresumeId);

    /**
     * Deletes an existing EmpResume with the given object.
     *
     * @param empResume The instance of the EmpResume to be deleted; value cannot be null.
     */
    void delete(EmpResume empResume);

    /**
     * Find all EmpResumes matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching EmpResumes.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<EmpResume> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all EmpResumes matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching EmpResumes.
     *
     * @see Pageable
     * @see Page
     */
    Page<EmpResume> findAll(String query, Pageable pageable);

    /**
     * Exports all EmpResumes matching the given input query to the given exportType format.
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
     * Exports all EmpResumes matching the given input query to the given exportType format.
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
     * Retrieve the count of the EmpResumes in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the EmpResume.
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