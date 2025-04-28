/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads;

import com.oracle.bmc.jmsjavadownloads.requests.*;
import com.oracle.bmc.jmsjavadownloads.responses.*;

/**
 * The APIs for the <a href="https://docs.oracle.com/en-us/iaas/jms/doc/java-download.html">Java
 * Download</a> feature of Java Management Service.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
public interface JavaDownloadAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Cancels the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Create a new report in the specified format containing the download details for the tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateJavaDownloadReportResponse> createJavaDownloadReport(
            CreateJavaDownloadReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateJavaDownloadReportRequest, CreateJavaDownloadReportResponse>
                    handler);

    /**
     * Creates a new JavaDownloadToken in the tenancy with specified attributes. Ensure that you
     * review the license terms before token generation. Visit the <a
     * href=\"https://www.oracle.com/java/technologies/downloads\"/>Oracle Java Downloads</a> page
     * to understand the license terms of the Java version for which you are generating a token. By
     * generating a token, you agree to the associated license terms. See <a
     * href=\"https://www.oracle.com/cis/java/technologies/javase/jdk-faqs.html\">Oracle JDK
     * Licensing - FAQs</a> for detailed information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateJavaDownloadTokenResponse> createJavaDownloadToken(
            CreateJavaDownloadTokenRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateJavaDownloadTokenRequest, CreateJavaDownloadTokenResponse>
                    handler);

    /**
     * Creates a Java license acceptance record for the specified license type in a tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateJavaLicenseAcceptanceRecordResponse>
            createJavaLicenseAcceptanceRecord(
                    CreateJavaLicenseAcceptanceRecordRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateJavaLicenseAcceptanceRecordRequest,
                                    CreateJavaLicenseAcceptanceRecordResponse>
                            handler);

    /**
     * Deletes a JavaDownloadReport resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteJavaDownloadReportResponse> deleteJavaDownloadReport(
            DeleteJavaDownloadReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteJavaDownloadReportRequest, DeleteJavaDownloadReportResponse>
                    handler);

    /**
     * Deletes a JavaDownloadToken resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteJavaDownloadTokenResponse> deleteJavaDownloadToken(
            DeleteJavaDownloadTokenRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteJavaDownloadTokenRequest, DeleteJavaDownloadTokenResponse>
                    handler);

    /**
     * Deletes a Java license acceptance record with the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteJavaLicenseAcceptanceRecordResponse>
            deleteJavaLicenseAcceptanceRecord(
                    DeleteJavaLicenseAcceptanceRecordRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteJavaLicenseAcceptanceRecordRequest,
                                    DeleteJavaLicenseAcceptanceRecordResponse>
                            handler);

    /**
     * Generates a download URL and returns it in the response payload. The URL in the response can
     * then be used for downloading the specific Java runtime artifact.
     *
     * <p>Use the {@link #getJavaRelease(GetJavaReleaseRequest, Consumer, Consumer) getJavaRelease}
     * API to get information about available artifacts for a specific release. Each artifact is
     * uniquely identified by an `artifactId`. Refer {@link #javaArtifact(JavaArtifactRequest,
     * Consumer, Consumer) javaArtifact} for more details.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateArtifactDownloadUrlResponse> generateArtifactDownloadUrl(
            GenerateArtifactDownloadUrlRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GenerateArtifactDownloadUrlRequest, GenerateArtifactDownloadUrlResponse>
                    handler);

    /**
     * Gets a JavaDownloadReport by the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJavaDownloadReportResponse> getJavaDownloadReport(
            GetJavaDownloadReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetJavaDownloadReportRequest, GetJavaDownloadReportResponse>
                    handler);

    /**
     * Retrieve a Java download report with the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJavaDownloadReportContentResponse> getJavaDownloadReportContent(
            GetJavaDownloadReportContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetJavaDownloadReportContentRequest,
                            GetJavaDownloadReportContentResponse>
                    handler);

    /**
     * Gets a JavaDownloadToken by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJavaDownloadTokenResponse> getJavaDownloadToken(
            GetJavaDownloadTokenRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetJavaDownloadTokenRequest, GetJavaDownloadTokenResponse>
                    handler);

    /**
     * Return details of the specified Java license type.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJavaLicenseResponse> getJavaLicense(
            GetJavaLicenseRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJavaLicenseRequest, GetJavaLicenseResponse>
                    handler);

    /**
     * Returns a specific Java license acceptance record in a tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJavaLicenseAcceptanceRecordResponse>
            getJavaLicenseAcceptanceRecord(
                    GetJavaLicenseAcceptanceRecordRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetJavaLicenseAcceptanceRecordRequest,
                                    GetJavaLicenseAcceptanceRecordResponse>
                            handler);

    /**
     * Gets details of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Returns a list of Java download records in a tenancy based on specified parameters. See
     * {@link #listJavaReleases(ListJavaReleasesRequest, Consumer, Consumer) listJavaReleases} for
     * possible values of `javaFamilyVersion` and `javaReleaseVersion` parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJavaDownloadRecordsResponse> listJavaDownloadRecords(
            ListJavaDownloadRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListJavaDownloadRecordsRequest, ListJavaDownloadRecordsResponse>
                    handler);

    /**
     * Returns a list of JavaDownloadReports.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJavaDownloadReportsResponse> listJavaDownloadReports(
            ListJavaDownloadReportsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListJavaDownloadReportsRequest, ListJavaDownloadReportsResponse>
                    handler);

    /**
     * Returns a list of JavaDownloadTokens.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJavaDownloadTokensResponse> listJavaDownloadTokens(
            ListJavaDownloadTokensRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListJavaDownloadTokensRequest, ListJavaDownloadTokensResponse>
                    handler);

    /**
     * Returns a list of all the Java license acceptance records in a tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJavaLicenseAcceptanceRecordsResponse>
            listJavaLicenseAcceptanceRecords(
                    ListJavaLicenseAcceptanceRecordsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListJavaLicenseAcceptanceRecordsRequest,
                                    ListJavaLicenseAcceptanceRecordsResponse>
                            handler);

    /**
     * Return a list with details of all Java licenses.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJavaLicensesResponse> listJavaLicenses(
            ListJavaLicensesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJavaLicensesRequest, ListJavaLicensesResponse>
                    handler);

    /**
     * Returns a (paginated) list of errors for the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Returns a (paginated) list of logs for the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Returns list of download counts grouped by the specified property.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedJavaDownloadCountsResponse>
            requestSummarizedJavaDownloadCounts(
                    RequestSummarizedJavaDownloadCountsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedJavaDownloadCountsRequest,
                                    RequestSummarizedJavaDownloadCountsResponse>
                            handler);

    /**
     * Updates the JavaDownloadToken specified by the identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateJavaDownloadTokenResponse> updateJavaDownloadToken(
            UpdateJavaDownloadTokenRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateJavaDownloadTokenRequest, UpdateJavaDownloadTokenResponse>
                    handler);

    /**
     * Updates a specific Java license acceptance record in a tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateJavaLicenseAcceptanceRecordResponse>
            updateJavaLicenseAcceptanceRecord(
                    UpdateJavaLicenseAcceptanceRecordRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateJavaLicenseAcceptanceRecordRequest,
                                    UpdateJavaLicenseAcceptanceRecordResponse>
                            handler);
}
