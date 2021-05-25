/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetAwrDbReportExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetAwrDbReportRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetAwrDbReportRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The parameter to filter the database by internal ID.
     * Note that the internal ID of the database can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs:
     *
     */
    private String awrDbId;

    /**
     * The optional multiple value query parameter to filter the database instance numbers.
     */
    private java.util.List<Integer> instNums;

    /**
     * The optional greater than or equal to filter on the snapshot ID.
     */
    private Integer beginSnIdGreaterThanOrEqualTo;

    /**
     * The optional less than or equal to query parameter to filter the snapshot ID.
     */
    private Integer endSnIdLessThanOrEqualTo;

    /**
     * The optional greater than or equal to query parameter to filter the timestamp.
     */
    private java.util.Date timeGreaterThanOrEqualTo;

    /**
     * The optional less than or equal to query parameter to filter the timestamp.
     */
    private java.util.Date timeLessThanOrEqualTo;

    /**
     * The query parameter to filter the AWR report types.
     */
    private ReportType reportType;

    /**
     * The query parameter to filter the AWR report types.
     **/
    public enum ReportType {
        Awr("AWR"),
        Ash("ASH"),
        ;

        private final String value;
        private static java.util.Map<String, ReportType> map;

        static {
            map = new java.util.HashMap<>();
            for (ReportType v : ReportType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ReportType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReportType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ReportType: " + key);
        }
    };
    /**
     * The optional query parameter to filter the database container by an exact ID value.
     * Note that the database container ID can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbSnapshotRanges
     *
     */
    private Integer containerId;

    /**
     * The format of the AWR report.
     */
    private ReportFormat reportFormat;

    /**
     * The format of the AWR report.
     **/
    public enum ReportFormat {
        Html("HTML"),
        Text("TEXT"),
        ;

        private final String value;
        private static java.util.Map<String, ReportFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (ReportFormat v : ReportFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        ReportFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReportFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ReportFormat: " + key);
        }
    };
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetAwrDbReportRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAwrDbReportRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            awrDbId(o.getAwrDbId());
            instNums(o.getInstNums());
            beginSnIdGreaterThanOrEqualTo(o.getBeginSnIdGreaterThanOrEqualTo());
            endSnIdLessThanOrEqualTo(o.getEndSnIdLessThanOrEqualTo());
            timeGreaterThanOrEqualTo(o.getTimeGreaterThanOrEqualTo());
            timeLessThanOrEqualTo(o.getTimeLessThanOrEqualTo());
            reportType(o.getReportType());
            containerId(o.getContainerId());
            reportFormat(o.getReportFormat());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAwrDbReportRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetAwrDbReportRequest
         */
        public GetAwrDbReportRequest build() {
            GetAwrDbReportRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
