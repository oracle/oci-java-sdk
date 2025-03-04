/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetManagedInstanceContentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetManagedInstanceContentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class GetManagedInstanceContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * managed instance.
     */
    private String managedInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * managed instance.
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /** A filter to return only vulnerabilities matching the given types. */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.VulnerabilityTypes>
            vulnerabilityType;

    /** A filter to return only vulnerabilities matching the given types. */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.VulnerabilityTypes>
            getVulnerabilityType() {
        return vulnerabilityType;
    }
    /**
     * The assigned erratum name. It's unique and not changeable.
     *
     * <p>Example: {@code ELSA-2020-5804}
     */
    private java.util.List<String> advisoryName;

    /**
     * The assigned erratum name. It's unique and not changeable.
     *
     * <p>Example: {@code ELSA-2020-5804}
     */
    public java.util.List<String> getAdvisoryName() {
        return advisoryName;
    }
    /** A filter to return resources that may partially match the erratum advisory name given. */
    private String advisoryNameContains;

    /** A filter to return resources that may partially match the erratum advisory name given. */
    public String getAdvisoryNameContains() {
        return advisoryNameContains;
    }
    /** A filter to return only errata that match the given advisory types. */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.AdvisoryTypes> advisoryType;

    /** A filter to return only errata that match the given advisory types. */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.AdvisoryTypes> getAdvisoryType() {
        return advisoryType;
    }
    /**
     * A filter to return vulnerabilities that match the given name. For Linux instances, this
     * refers to the advisory name. For Windows instances, this refers to the Windows update display
     * name.
     */
    private java.util.List<String> vulnerabilityName;

    /**
     * A filter to return vulnerabilities that match the given name. For Linux instances, this
     * refers to the advisory name. For Windows instances, this refers to the Windows update display
     * name.
     */
    public java.util.List<String> getVulnerabilityName() {
        return vulnerabilityName;
    }
    /**
     * A filter to return vulnerabilities that partially match the given name. For Linux instances,
     * this refers to the advisory name. For Windows instances, this refers to the Windows update
     * display name.
     */
    private String vulnerabilityNameContains;

    /**
     * A filter to return vulnerabilities that partially match the given name. For Linux instances,
     * this refers to the advisory name. For Windows instances, this refers to the Windows update
     * display name.
     */
    public String getVulnerabilityNameContains() {
        return vulnerabilityNameContains;
    }
    /** The format of the report to download. Default is CSV. */
    private ReportFormat reportFormat;

    /** The format of the report to download. Default is CSV. */
    public enum ReportFormat implements com.oracle.bmc.http.internal.BmcEnum {
        Csv("csv"),
        Json("json"),
        Xml("xml"),
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

    /** The format of the report to download. Default is CSV. */
    public ReportFormat getReportFormat() {
        return reportFormat;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetManagedInstanceContentRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * managed instance.
         */
        private String managedInstanceId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * managed instance.
         *
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        /** A filter to return only vulnerabilities matching the given types. */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.VulnerabilityTypes>
                vulnerabilityType = null;

        /**
         * A filter to return only vulnerabilities matching the given types.
         *
         * @param vulnerabilityType the value to set
         * @return this builder instance
         */
        public Builder vulnerabilityType(
                java.util.List<com.oracle.bmc.osmanagementhub.model.VulnerabilityTypes>
                        vulnerabilityType) {
            this.vulnerabilityType = vulnerabilityType;
            return this;
        }

        /**
         * Singular setter. A filter to return only vulnerabilities matching the given types.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder vulnerabilityType(VulnerabilityTypes singularValue) {
            return this.vulnerabilityType(java.util.Arrays.asList(singularValue));
        }

        /**
         * The assigned erratum name. It's unique and not changeable.
         *
         * <p>Example: {@code ELSA-2020-5804}
         */
        private java.util.List<String> advisoryName = null;

        /**
         * The assigned erratum name. It's unique and not changeable.
         *
         * <p>Example: {@code ELSA-2020-5804}
         *
         * @param advisoryName the value to set
         * @return this builder instance
         */
        public Builder advisoryName(java.util.List<String> advisoryName) {
            this.advisoryName = advisoryName;
            return this;
        }

        /**
         * Singular setter. The assigned erratum name. It's unique and not changeable.
         *
         * <p>Example: {@code ELSA-2020-5804}
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder advisoryName(String singularValue) {
            return this.advisoryName(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return resources that may partially match the erratum advisory name given.
         */
        private String advisoryNameContains = null;

        /**
         * A filter to return resources that may partially match the erratum advisory name given.
         *
         * @param advisoryNameContains the value to set
         * @return this builder instance
         */
        public Builder advisoryNameContains(String advisoryNameContains) {
            this.advisoryNameContains = advisoryNameContains;
            return this;
        }

        /** A filter to return only errata that match the given advisory types. */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.AdvisoryTypes> advisoryType =
                null;

        /**
         * A filter to return only errata that match the given advisory types.
         *
         * @param advisoryType the value to set
         * @return this builder instance
         */
        public Builder advisoryType(
                java.util.List<com.oracle.bmc.osmanagementhub.model.AdvisoryTypes> advisoryType) {
            this.advisoryType = advisoryType;
            return this;
        }

        /**
         * Singular setter. A filter to return only errata that match the given advisory types.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder advisoryType(AdvisoryTypes singularValue) {
            return this.advisoryType(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return vulnerabilities that match the given name. For Linux instances, this
         * refers to the advisory name. For Windows instances, this refers to the Windows update
         * display name.
         */
        private java.util.List<String> vulnerabilityName = null;

        /**
         * A filter to return vulnerabilities that match the given name. For Linux instances, this
         * refers to the advisory name. For Windows instances, this refers to the Windows update
         * display name.
         *
         * @param vulnerabilityName the value to set
         * @return this builder instance
         */
        public Builder vulnerabilityName(java.util.List<String> vulnerabilityName) {
            this.vulnerabilityName = vulnerabilityName;
            return this;
        }

        /**
         * Singular setter. A filter to return vulnerabilities that match the given name. For Linux
         * instances, this refers to the advisory name. For Windows instances, this refers to the
         * Windows update display name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder vulnerabilityName(String singularValue) {
            return this.vulnerabilityName(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return vulnerabilities that partially match the given name. For Linux
         * instances, this refers to the advisory name. For Windows instances, this refers to the
         * Windows update display name.
         */
        private String vulnerabilityNameContains = null;

        /**
         * A filter to return vulnerabilities that partially match the given name. For Linux
         * instances, this refers to the advisory name. For Windows instances, this refers to the
         * Windows update display name.
         *
         * @param vulnerabilityNameContains the value to set
         * @return this builder instance
         */
        public Builder vulnerabilityNameContains(String vulnerabilityNameContains) {
            this.vulnerabilityNameContains = vulnerabilityNameContains;
            return this;
        }

        /** The format of the report to download. Default is CSV. */
        private ReportFormat reportFormat = null;

        /**
         * The format of the report to download. Default is CSV.
         *
         * @param reportFormat the value to set
         * @return this builder instance
         */
        public Builder reportFormat(ReportFormat reportFormat) {
            this.reportFormat = reportFormat;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(GetManagedInstanceContentRequest o) {
            managedInstanceId(o.getManagedInstanceId());
            vulnerabilityType(o.getVulnerabilityType());
            advisoryName(o.getAdvisoryName());
            advisoryNameContains(o.getAdvisoryNameContains());
            advisoryType(o.getAdvisoryType());
            vulnerabilityName(o.getVulnerabilityName());
            vulnerabilityNameContains(o.getVulnerabilityNameContains());
            reportFormat(o.getReportFormat());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetManagedInstanceContentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetManagedInstanceContentRequest
         */
        public GetManagedInstanceContentRequest build() {
            GetManagedInstanceContentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetManagedInstanceContentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetManagedInstanceContentRequest
         */
        public GetManagedInstanceContentRequest buildWithoutInvocationCallback() {
            GetManagedInstanceContentRequest request = new GetManagedInstanceContentRequest();
            request.managedInstanceId = managedInstanceId;
            request.vulnerabilityType = vulnerabilityType;
            request.advisoryName = advisoryName;
            request.advisoryNameContains = advisoryNameContains;
            request.advisoryType = advisoryType;
            request.vulnerabilityName = vulnerabilityName;
            request.vulnerabilityNameContains = vulnerabilityNameContains;
            request.reportFormat = reportFormat;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetManagedInstanceContentRequest(managedInstanceId, vulnerabilityType,
            // advisoryName, advisoryNameContains, advisoryType, vulnerabilityName,
            // vulnerabilityNameContains, reportFormat, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedInstanceId(managedInstanceId)
                .vulnerabilityType(vulnerabilityType)
                .advisoryName(advisoryName)
                .advisoryNameContains(advisoryNameContains)
                .advisoryType(advisoryType)
                .vulnerabilityName(vulnerabilityName)
                .vulnerabilityNameContains(vulnerabilityNameContains)
                .reportFormat(reportFormat)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",vulnerabilityType=").append(String.valueOf(this.vulnerabilityType));
        sb.append(",advisoryName=").append(String.valueOf(this.advisoryName));
        sb.append(",advisoryNameContains=").append(String.valueOf(this.advisoryNameContains));
        sb.append(",advisoryType=").append(String.valueOf(this.advisoryType));
        sb.append(",vulnerabilityName=").append(String.valueOf(this.vulnerabilityName));
        sb.append(",vulnerabilityNameContains=")
                .append(String.valueOf(this.vulnerabilityNameContains));
        sb.append(",reportFormat=").append(String.valueOf(this.reportFormat));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetManagedInstanceContentRequest)) {
            return false;
        }

        GetManagedInstanceContentRequest other = (GetManagedInstanceContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.vulnerabilityType, other.vulnerabilityType)
                && java.util.Objects.equals(this.advisoryName, other.advisoryName)
                && java.util.Objects.equals(this.advisoryNameContains, other.advisoryNameContains)
                && java.util.Objects.equals(this.advisoryType, other.advisoryType)
                && java.util.Objects.equals(this.vulnerabilityName, other.vulnerabilityName)
                && java.util.Objects.equals(
                        this.vulnerabilityNameContains, other.vulnerabilityNameContains)
                && java.util.Objects.equals(this.reportFormat, other.reportFormat)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.vulnerabilityType == null ? 43 : this.vulnerabilityType.hashCode());
        result = (result * PRIME) + (this.advisoryName == null ? 43 : this.advisoryName.hashCode());
        result =
                (result * PRIME)
                        + (this.advisoryNameContains == null
                                ? 43
                                : this.advisoryNameContains.hashCode());
        result = (result * PRIME) + (this.advisoryType == null ? 43 : this.advisoryType.hashCode());
        result =
                (result * PRIME)
                        + (this.vulnerabilityName == null ? 43 : this.vulnerabilityName.hashCode());
        result =
                (result * PRIME)
                        + (this.vulnerabilityNameContains == null
                                ? 43
                                : this.vulnerabilityNameContains.hashCode());
        result = (result * PRIME) + (this.reportFormat == null ? 43 : this.reportFormat.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
