/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAddmDbSchemaObjectsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeAddmDbSchemaObjectsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeAddmDbSchemaObjectsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * One or more unique Object id (from RDBMS)
     *
     */
    private java.util.List<Integer> objectIdentifier;

    /**
     * One or more unique Object id (from RDBMS)
     *
     */
    public java.util.List<Integer> getObjectIdentifier() {
        return objectIdentifier;
    }
    /**
     * Optional list of database [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
     *
     */
    private java.util.List<String> databaseId;

    /**
     * Optional list of database [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
     *
     */
    public java.util.List<String> getDatabaseId() {
        return databaseId;
    }
    /**
     * Optional list of database insight resource [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    private java.util.List<String> id;

    /**
     * Optional list of database insight resource [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    public java.util.List<String> getId() {
        return id;
    }
    /**
     * Analysis start time in UTC in ISO 8601 format(inclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * The minimum allowed value is 2 years prior to the current day.
     * timeIntervalStart and timeIntervalEnd parameters are used together.
     * If analysisTimeInterval is specified, this parameter is ignored.
     *
     */
    private java.util.Date timeIntervalStart;

    /**
     * Analysis start time in UTC in ISO 8601 format(inclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * The minimum allowed value is 2 years prior to the current day.
     * timeIntervalStart and timeIntervalEnd parameters are used together.
     * If analysisTimeInterval is specified, this parameter is ignored.
     *
     */
    public java.util.Date getTimeIntervalStart() {
        return timeIntervalStart;
    }
    /**
     * Analysis end time in UTC in ISO 8601 format(exclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * timeIntervalStart and timeIntervalEnd are used together.
     * If timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
     *
     */
    private java.util.Date timeIntervalEnd;

    /**
     * Analysis end time in UTC in ISO 8601 format(exclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * timeIntervalStart and timeIntervalEnd are used together.
     * If timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
     *
     */
    public java.util.Date getTimeIntervalEnd() {
        return timeIntervalEnd;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A list of tag filters to apply.  Only resources with a defined tag matching the value will be returned.
     * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
     * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
     * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
     *
     */
    private java.util.List<String> definedTagEquals;

    /**
     * A list of tag filters to apply.  Only resources with a defined tag matching the value will be returned.
     * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
     * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
     * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
     *
     */
    public java.util.List<String> getDefinedTagEquals() {
        return definedTagEquals;
    }
    /**
     * A list of tag filters to apply.  Only resources with a freeform tag matching the value will be returned.
     * The key for each tag is "{tagName}.{value}".  All inputs are case-insensitive.
     * Multiple values for the same tag name are interpreted as "OR".  Values for different tag names are interpreted as "AND".
     *
     */
    private java.util.List<String> freeformTagEquals;

    /**
     * A list of tag filters to apply.  Only resources with a freeform tag matching the value will be returned.
     * The key for each tag is "{tagName}.{value}".  All inputs are case-insensitive.
     * Multiple values for the same tag name are interpreted as "OR".  Values for different tag names are interpreted as "AND".
     *
     */
    public java.util.List<String> getFreeformTagEquals() {
        return freeformTagEquals;
    }
    /**
     * A list of tag existence filters to apply.  Only resources for which the specified defined tags exist will be returned.
     * Each item in the list has the format "{namespace}.{tagName}.true" (for checking existence of a defined tag)
     * or "{namespace}.true".  All inputs are case-insensitive.
     * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
     * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
     * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
     *
     */
    private java.util.List<String> definedTagExists;

    /**
     * A list of tag existence filters to apply.  Only resources for which the specified defined tags exist will be returned.
     * Each item in the list has the format "{namespace}.{tagName}.true" (for checking existence of a defined tag)
     * or "{namespace}.true".  All inputs are case-insensitive.
     * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
     * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
     * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
     *
     */
    public java.util.List<String> getDefinedTagExists() {
        return definedTagExists;
    }
    /**
     * A list of tag existence filters to apply.  Only resources for which the specified freeform tags exist the value will be returned.
     * The key for each tag is "{tagName}.true".  All inputs are case-insensitive.
     * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
     * Multiple values for different tag names are interpreted as "AND".
     *
     */
    private java.util.List<String> freeformTagExists;

    /**
     * A list of tag existence filters to apply.  Only resources for which the specified freeform tags exist the value will be returned.
     * The key for each tag is "{tagName}.true".  All inputs are case-insensitive.
     * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
     * Multiple values for different tag names are interpreted as "AND".
     *
     */
    public java.util.List<String> getFreeformTagExists() {
        return freeformTagExists;
    }
    /**
     * A flag to search all resources within a given compartment and all sub-compartments.
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * A flag to search all resources within a given compartment and all sub-compartments.
     *
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeAddmDbSchemaObjectsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * One or more unique Object id (from RDBMS)
         *
         */
        private java.util.List<Integer> objectIdentifier = null;

        /**
         * One or more unique Object id (from RDBMS)
         *
         * @param objectIdentifier the value to set
         * @return this builder instance
         */
        public Builder objectIdentifier(java.util.List<Integer> objectIdentifier) {
            this.objectIdentifier = objectIdentifier;
            return this;
        }

        /**
         * Singular setter. One or more unique Object id (from RDBMS)
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder objectIdentifier(Integer singularValue) {
            return this.objectIdentifier(java.util.Arrays.asList(singularValue));
        }

        /**
         * Optional list of database [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
         *
         */
        private java.util.List<String> databaseId = null;

        /**
         * Optional list of database [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
         *
         * @param databaseId the value to set
         * @return this builder instance
         */
        public Builder databaseId(java.util.List<String> databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        /**
         * Singular setter. Optional list of database [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder databaseId(String singularValue) {
            return this.databaseId(java.util.Arrays.asList(singularValue));
        }

        /**
         * Optional list of database insight resource [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         */
        private java.util.List<String> id = null;

        /**
         * Optional list of database insight resource [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(java.util.List<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Singular setter. Optional list of database insight resource [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder id(String singularValue) {
            return this.id(java.util.Arrays.asList(singularValue));
        }

        /**
         * Analysis start time in UTC in ISO 8601 format(inclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * The minimum allowed value is 2 years prior to the current day.
         * timeIntervalStart and timeIntervalEnd parameters are used together.
         * If analysisTimeInterval is specified, this parameter is ignored.
         *
         */
        private java.util.Date timeIntervalStart = null;

        /**
         * Analysis start time in UTC in ISO 8601 format(inclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * The minimum allowed value is 2 years prior to the current day.
         * timeIntervalStart and timeIntervalEnd parameters are used together.
         * If analysisTimeInterval is specified, this parameter is ignored.
         *
         * @param timeIntervalStart the value to set
         * @return this builder instance
         */
        public Builder timeIntervalStart(java.util.Date timeIntervalStart) {
            this.timeIntervalStart = timeIntervalStart;
            return this;
        }

        /**
         * Analysis end time in UTC in ISO 8601 format(exclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * timeIntervalStart and timeIntervalEnd are used together.
         * If timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
         *
         */
        private java.util.Date timeIntervalEnd = null;

        /**
         * Analysis end time in UTC in ISO 8601 format(exclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * timeIntervalStart and timeIntervalEnd are used together.
         * If timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
         *
         * @param timeIntervalEnd the value to set
         * @return this builder instance
         */
        public Builder timeIntervalEnd(java.util.Date timeIntervalEnd) {
            this.timeIntervalEnd = timeIntervalEnd;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to
         * return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to
         * return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A list of tag filters to apply.  Only resources with a defined tag matching the value will be returned.
         * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
         * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         */
        private java.util.List<String> definedTagEquals = null;

        /**
         * A list of tag filters to apply.  Only resources with a defined tag matching the value will be returned.
         * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
         * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         * @param definedTagEquals the value to set
         * @return this builder instance
         */
        public Builder definedTagEquals(java.util.List<String> definedTagEquals) {
            this.definedTagEquals = definedTagEquals;
            return this;
        }

        /**
         * Singular setter. A list of tag filters to apply.  Only resources with a defined tag matching the value will be returned.
         * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
         * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder definedTagEquals(String singularValue) {
            return this.definedTagEquals(java.util.Arrays.asList(singularValue));
        }

        /**
         * A list of tag filters to apply.  Only resources with a freeform tag matching the value will be returned.
         * The key for each tag is "{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same tag name are interpreted as "OR".  Values for different tag names are interpreted as "AND".
         *
         */
        private java.util.List<String> freeformTagEquals = null;

        /**
         * A list of tag filters to apply.  Only resources with a freeform tag matching the value will be returned.
         * The key for each tag is "{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same tag name are interpreted as "OR".  Values for different tag names are interpreted as "AND".
         *
         * @param freeformTagEquals the value to set
         * @return this builder instance
         */
        public Builder freeformTagEquals(java.util.List<String> freeformTagEquals) {
            this.freeformTagEquals = freeformTagEquals;
            return this;
        }

        /**
         * Singular setter. A list of tag filters to apply.  Only resources with a freeform tag matching the value will be returned.
         * The key for each tag is "{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same tag name are interpreted as "OR".  Values for different tag names are interpreted as "AND".
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder freeformTagEquals(String singularValue) {
            return this.freeformTagEquals(java.util.Arrays.asList(singularValue));
        }

        /**
         * A list of tag existence filters to apply.  Only resources for which the specified defined tags exist will be returned.
         * Each item in the list has the format "{namespace}.{tagName}.true" (for checking existence of a defined tag)
         * or "{namespace}.true".  All inputs are case-insensitive.
         * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
         * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
         * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         */
        private java.util.List<String> definedTagExists = null;

        /**
         * A list of tag existence filters to apply.  Only resources for which the specified defined tags exist will be returned.
         * Each item in the list has the format "{namespace}.{tagName}.true" (for checking existence of a defined tag)
         * or "{namespace}.true".  All inputs are case-insensitive.
         * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
         * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
         * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         * @param definedTagExists the value to set
         * @return this builder instance
         */
        public Builder definedTagExists(java.util.List<String> definedTagExists) {
            this.definedTagExists = definedTagExists;
            return this;
        }

        /**
         * Singular setter. A list of tag existence filters to apply.  Only resources for which the specified defined tags exist will be returned.
         * Each item in the list has the format "{namespace}.{tagName}.true" (for checking existence of a defined tag)
         * or "{namespace}.true".  All inputs are case-insensitive.
         * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
         * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
         * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder definedTagExists(String singularValue) {
            return this.definedTagExists(java.util.Arrays.asList(singularValue));
        }

        /**
         * A list of tag existence filters to apply.  Only resources for which the specified freeform tags exist the value will be returned.
         * The key for each tag is "{tagName}.true".  All inputs are case-insensitive.
         * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
         * Multiple values for different tag names are interpreted as "AND".
         *
         */
        private java.util.List<String> freeformTagExists = null;

        /**
         * A list of tag existence filters to apply.  Only resources for which the specified freeform tags exist the value will be returned.
         * The key for each tag is "{tagName}.true".  All inputs are case-insensitive.
         * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
         * Multiple values for different tag names are interpreted as "AND".
         *
         * @param freeformTagExists the value to set
         * @return this builder instance
         */
        public Builder freeformTagExists(java.util.List<String> freeformTagExists) {
            this.freeformTagExists = freeformTagExists;
            return this;
        }

        /**
         * Singular setter. A list of tag existence filters to apply.  Only resources for which the specified freeform tags exist the value will be returned.
         * The key for each tag is "{tagName}.true".  All inputs are case-insensitive.
         * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
         * Multiple values for different tag names are interpreted as "AND".
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder freeformTagExists(String singularValue) {
            return this.freeformTagExists(java.util.Arrays.asList(singularValue));
        }

        /**
         * A flag to search all resources within a given compartment and all sub-compartments.
         *
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * A flag to search all resources within a given compartment and all sub-compartments.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

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
        public Builder copy(SummarizeAddmDbSchemaObjectsRequest o) {
            compartmentId(o.getCompartmentId());
            objectIdentifier(o.getObjectIdentifier());
            databaseId(o.getDatabaseId());
            id(o.getId());
            timeIntervalStart(o.getTimeIntervalStart());
            timeIntervalEnd(o.getTimeIntervalEnd());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            definedTagEquals(o.getDefinedTagEquals());
            freeformTagEquals(o.getFreeformTagEquals());
            definedTagExists(o.getDefinedTagExists());
            freeformTagExists(o.getFreeformTagExists());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeAddmDbSchemaObjectsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeAddmDbSchemaObjectsRequest
         */
        public SummarizeAddmDbSchemaObjectsRequest build() {
            SummarizeAddmDbSchemaObjectsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeAddmDbSchemaObjectsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeAddmDbSchemaObjectsRequest
         */
        public SummarizeAddmDbSchemaObjectsRequest buildWithoutInvocationCallback() {
            SummarizeAddmDbSchemaObjectsRequest request = new SummarizeAddmDbSchemaObjectsRequest();
            request.compartmentId = compartmentId;
            request.objectIdentifier = objectIdentifier;
            request.databaseId = databaseId;
            request.id = id;
            request.timeIntervalStart = timeIntervalStart;
            request.timeIntervalEnd = timeIntervalEnd;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.definedTagEquals = definedTagEquals;
            request.freeformTagEquals = freeformTagEquals;
            request.definedTagExists = definedTagExists;
            request.freeformTagExists = freeformTagExists;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            return request;
            // new SummarizeAddmDbSchemaObjectsRequest(compartmentId, objectIdentifier, databaseId, id, timeIntervalStart, timeIntervalEnd, limit, page, opcRequestId, definedTagEquals, freeformTagEquals, definedTagExists, freeformTagExists, compartmentIdInSubtree);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .objectIdentifier(objectIdentifier)
                .databaseId(databaseId)
                .id(id)
                .timeIntervalStart(timeIntervalStart)
                .timeIntervalEnd(timeIntervalEnd)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .definedTagEquals(definedTagEquals)
                .freeformTagEquals(freeformTagEquals)
                .definedTagExists(definedTagExists)
                .freeformTagExists(freeformTagExists)
                .compartmentIdInSubtree(compartmentIdInSubtree);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",objectIdentifier=").append(String.valueOf(this.objectIdentifier));
        sb.append(",databaseId=").append(String.valueOf(this.databaseId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",timeIntervalStart=").append(String.valueOf(this.timeIntervalStart));
        sb.append(",timeIntervalEnd=").append(String.valueOf(this.timeIntervalEnd));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",definedTagEquals=").append(String.valueOf(this.definedTagEquals));
        sb.append(",freeformTagEquals=").append(String.valueOf(this.freeformTagEquals));
        sb.append(",definedTagExists=").append(String.valueOf(this.definedTagExists));
        sb.append(",freeformTagExists=").append(String.valueOf(this.freeformTagExists));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeAddmDbSchemaObjectsRequest)) {
            return false;
        }

        SummarizeAddmDbSchemaObjectsRequest other = (SummarizeAddmDbSchemaObjectsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.objectIdentifier, other.objectIdentifier)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeIntervalStart, other.timeIntervalStart)
                && java.util.Objects.equals(this.timeIntervalEnd, other.timeIntervalEnd)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.definedTagEquals, other.definedTagEquals)
                && java.util.Objects.equals(this.freeformTagEquals, other.freeformTagEquals)
                && java.util.Objects.equals(this.definedTagExists, other.definedTagExists)
                && java.util.Objects.equals(this.freeformTagExists, other.freeformTagExists)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.objectIdentifier == null ? 43 : this.objectIdentifier.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalStart == null ? 43 : this.timeIntervalStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalEnd == null ? 43 : this.timeIntervalEnd.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.definedTagEquals == null ? 43 : this.definedTagEquals.hashCode());
        result =
                (result * PRIME)
                        + (this.freeformTagEquals == null ? 43 : this.freeformTagEquals.hashCode());
        result =
                (result * PRIME)
                        + (this.definedTagExists == null ? 43 : this.definedTagExists.hashCode());
        result =
                (result * PRIME)
                        + (this.freeformTagExists == null ? 43 : this.freeformTagExists.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        return result;
    }
}
