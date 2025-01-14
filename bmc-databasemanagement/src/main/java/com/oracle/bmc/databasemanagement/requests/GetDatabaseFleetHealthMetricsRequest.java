/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDatabaseFleetHealthMetricsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDatabaseFleetHealthMetricsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class GetDatabaseFleetHealthMetricsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The baseline time for metrics comparison. */
    private String compareBaselineTime;

    /** The baseline time for metrics comparison. */
    public String getCompareBaselineTime() {
        return compareBaselineTime;
    }
    /** The target time for metrics comparison. */
    private String compareTargetTime;

    /** The target time for metrics comparison. */
    public String getCompareTargetTime() {
        return compareTargetTime;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database Group.
     */
    private String managedDatabaseGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database Group.
     */
    public String getManagedDatabaseGroupId() {
        return managedDatabaseGroupId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The time window used for metrics comparison. */
    private com.oracle.bmc.databasemanagement.model.CompareType compareType;

    /** The time window used for metrics comparison. */
    public com.oracle.bmc.databasemanagement.model.CompareType getCompareType() {
        return compareType;
    }
    /**
     * The filter used to retrieve a specific set of metrics by passing the desired metric names
     * with a comma separator. Note that, by default, the service returns all supported metrics.
     */
    private String filterByMetricNames;

    /**
     * The filter used to retrieve a specific set of metrics by passing the desired metric names
     * with a comma separator. Note that, by default, the service returns all supported metrics.
     */
    public String getFilterByMetricNames() {
        return filterByMetricNames;
    }
    /** The filter used to filter the databases in the fleet by a specific Oracle Database type. */
    private String filterByDatabaseType;

    /** The filter used to filter the databases in the fleet by a specific Oracle Database type. */
    public String getFilterByDatabaseType() {
        return filterByDatabaseType;
    }
    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database subtype.
     */
    private String filterByDatabaseSubType;

    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database subtype.
     */
    public String getFilterByDatabaseSubType() {
        return filterByDatabaseSubType;
    }
    /**
     * The page token representing the page from where the next set of paginated results are
     * retrieved. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page from where the next set of paginated results are
     * retrieved. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The maximum number of records returned in the paginated response. */
    private Integer limit;

    /** The maximum number of records returned in the paginated response. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is
     * ascending. The \u2018NAME\u2019 sort order is case-sensitive.
     */
    private SortBy sortBy;

    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is
     * ascending. The \u2018NAME\u2019 sort order is case-sensitive.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timecreated("TIMECREATED"),
        Name("NAME"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is
     * ascending. The \u2018NAME\u2019 sort order is case-sensitive.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending
     * (\u2018DESC\u2019) order. Ascending order is the default order.
     */
    private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder;

    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending
     * (\u2018DESC\u2019) order. Ascending order is the default order.
     */
    public com.oracle.bmc.databasemanagement.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database deployment
     * type.
     */
    private String filterByDatabaseDeploymentType;

    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database deployment
     * type.
     */
    public String getFilterByDatabaseDeploymentType() {
        return filterByDatabaseDeploymentType;
    }
    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database version.
     */
    private String filterByDatabaseVersion;

    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database version.
     */
    public String getFilterByDatabaseVersion() {
        return filterByDatabaseVersion;
    }
    /**
     * A list of tag filters to apply. Only resources with a defined tag matching the value will be
     * returned. Each item in the list has the format "{namespace}.{tagName}.{value}". All inputs
     * are case-insensitive. Multiple values for the same key (i.e. same namespace and tag name) are
     * interpreted as "OR". Values for different keys (i.e. different namespaces, different tag
     * names, or both) are interpreted as "AND".
     */
    private java.util.List<String> definedTagEquals;

    /**
     * A list of tag filters to apply. Only resources with a defined tag matching the value will be
     * returned. Each item in the list has the format "{namespace}.{tagName}.{value}". All inputs
     * are case-insensitive. Multiple values for the same key (i.e. same namespace and tag name) are
     * interpreted as "OR". Values for different keys (i.e. different namespaces, different tag
     * names, or both) are interpreted as "AND".
     */
    public java.util.List<String> getDefinedTagEquals() {
        return definedTagEquals;
    }
    /**
     * A list of tag filters to apply. Only resources with a freeform tag matching the value will be
     * returned. The key for each tag is "{tagName}.{value}". All inputs are case-insensitive.
     * Multiple values for the same tag name are interpreted as "OR". Values for different tag names
     * are interpreted as "AND".
     */
    private java.util.List<String> freeformTagEquals;

    /**
     * A list of tag filters to apply. Only resources with a freeform tag matching the value will be
     * returned. The key for each tag is "{tagName}.{value}". All inputs are case-insensitive.
     * Multiple values for the same tag name are interpreted as "OR". Values for different tag names
     * are interpreted as "AND".
     */
    public java.util.List<String> getFreeformTagEquals() {
        return freeformTagEquals;
    }
    /**
     * A list of tag existence filters to apply. Only resources for which the specified defined tags
     * exist will be returned. Each item in the list has the format "{namespace}.{tagName}.true"
     * (for checking existence of a defined tag) or "{namespace}.true". All inputs are
     * case-insensitive. Currently, only existence ("true" at the end) is supported. Absence
     * ("false" at the end) is not supported. Multiple values for the same key (i.e. same namespace
     * and tag name) are interpreted as "OR". Values for different keys (i.e. different namespaces,
     * different tag names, or both) are interpreted as "AND".
     */
    private java.util.List<String> definedTagExists;

    /**
     * A list of tag existence filters to apply. Only resources for which the specified defined tags
     * exist will be returned. Each item in the list has the format "{namespace}.{tagName}.true"
     * (for checking existence of a defined tag) or "{namespace}.true". All inputs are
     * case-insensitive. Currently, only existence ("true" at the end) is supported. Absence
     * ("false" at the end) is not supported. Multiple values for the same key (i.e. same namespace
     * and tag name) are interpreted as "OR". Values for different keys (i.e. different namespaces,
     * different tag names, or both) are interpreted as "AND".
     */
    public java.util.List<String> getDefinedTagExists() {
        return definedTagExists;
    }
    /**
     * A list of tag existence filters to apply. Only resources for which the specified freeform
     * tags exist the value will be returned. The key for each tag is "{tagName}.true". All inputs
     * are case-insensitive. Currently, only existence ("true" at the end) is supported. Absence
     * ("false" at the end) is not supported. Multiple values for different tag names are
     * interpreted as "AND".
     */
    private java.util.List<String> freeformTagExists;

    /**
     * A list of tag existence filters to apply. Only resources for which the specified freeform
     * tags exist the value will be returned. The key for each tag is "{tagName}.true". All inputs
     * are case-insensitive. Currently, only existence ("true" at the end) is supported. Absence
     * ("false" at the end) is not supported. Multiple values for different tag names are
     * interpreted as "AND".
     */
    public java.util.List<String> getFreeformTagExists() {
        return freeformTagExists;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDatabaseFleetHealthMetricsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The baseline time for metrics comparison. */
        private String compareBaselineTime = null;

        /**
         * The baseline time for metrics comparison.
         *
         * @param compareBaselineTime the value to set
         * @return this builder instance
         */
        public Builder compareBaselineTime(String compareBaselineTime) {
            this.compareBaselineTime = compareBaselineTime;
            return this;
        }

        /** The target time for metrics comparison. */
        private String compareTargetTime = null;

        /**
         * The target time for metrics comparison.
         *
         * @param compareTargetTime the value to set
         * @return this builder instance
         */
        public Builder compareTargetTime(String compareTargetTime) {
            this.compareTargetTime = compareTargetTime;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database Group.
         */
        private String managedDatabaseGroupId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database Group.
         *
         * @param managedDatabaseGroupId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseGroupId(String managedDatabaseGroupId) {
            this.managedDatabaseGroupId = managedDatabaseGroupId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The time window used for metrics comparison. */
        private com.oracle.bmc.databasemanagement.model.CompareType compareType = null;

        /**
         * The time window used for metrics comparison.
         *
         * @param compareType the value to set
         * @return this builder instance
         */
        public Builder compareType(
                com.oracle.bmc.databasemanagement.model.CompareType compareType) {
            this.compareType = compareType;
            return this;
        }

        /**
         * The filter used to retrieve a specific set of metrics by passing the desired metric names
         * with a comma separator. Note that, by default, the service returns all supported metrics.
         */
        private String filterByMetricNames = null;

        /**
         * The filter used to retrieve a specific set of metrics by passing the desired metric names
         * with a comma separator. Note that, by default, the service returns all supported metrics.
         *
         * @param filterByMetricNames the value to set
         * @return this builder instance
         */
        public Builder filterByMetricNames(String filterByMetricNames) {
            this.filterByMetricNames = filterByMetricNames;
            return this;
        }

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database type.
         */
        private String filterByDatabaseType = null;

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database type.
         *
         * @param filterByDatabaseType the value to set
         * @return this builder instance
         */
        public Builder filterByDatabaseType(String filterByDatabaseType) {
            this.filterByDatabaseType = filterByDatabaseType;
            return this;
        }

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database
         * subtype.
         */
        private String filterByDatabaseSubType = null;

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database
         * subtype.
         *
         * @param filterByDatabaseSubType the value to set
         * @return this builder instance
         */
        public Builder filterByDatabaseSubType(String filterByDatabaseSubType) {
            this.filterByDatabaseSubType = filterByDatabaseSubType;
            return this;
        }

        /**
         * The page token representing the page from where the next set of paginated results are
         * retrieved. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page from where the next set of paginated results are
         * retrieved. This is usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The maximum number of records returned in the paginated response. */
        private Integer limit = null;

        /**
         * The maximum number of records returned in the paginated response.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019
         * is ascending. The \u2018NAME\u2019 sort order is case-sensitive.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019
         * is ascending. The \u2018NAME\u2019 sort order is case-sensitive.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending
         * (\u2018DESC\u2019) order. Ascending order is the default order.
         */
        private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder = null;

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending
         * (\u2018DESC\u2019) order. Ascending order is the default order.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasemanagement.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database
         * deployment type.
         */
        private String filterByDatabaseDeploymentType = null;

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database
         * deployment type.
         *
         * @param filterByDatabaseDeploymentType the value to set
         * @return this builder instance
         */
        public Builder filterByDatabaseDeploymentType(String filterByDatabaseDeploymentType) {
            this.filterByDatabaseDeploymentType = filterByDatabaseDeploymentType;
            return this;
        }

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database
         * version.
         */
        private String filterByDatabaseVersion = null;

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database
         * version.
         *
         * @param filterByDatabaseVersion the value to set
         * @return this builder instance
         */
        public Builder filterByDatabaseVersion(String filterByDatabaseVersion) {
            this.filterByDatabaseVersion = filterByDatabaseVersion;
            return this;
        }

        /**
         * A list of tag filters to apply. Only resources with a defined tag matching the value will
         * be returned. Each item in the list has the format "{namespace}.{tagName}.{value}". All
         * inputs are case-insensitive. Multiple values for the same key (i.e. same namespace and
         * tag name) are interpreted as "OR". Values for different keys (i.e. different namespaces,
         * different tag names, or both) are interpreted as "AND".
         */
        private java.util.List<String> definedTagEquals = null;

        /**
         * A list of tag filters to apply. Only resources with a defined tag matching the value will
         * be returned. Each item in the list has the format "{namespace}.{tagName}.{value}". All
         * inputs are case-insensitive. Multiple values for the same key (i.e. same namespace and
         * tag name) are interpreted as "OR". Values for different keys (i.e. different namespaces,
         * different tag names, or both) are interpreted as "AND".
         *
         * @param definedTagEquals the value to set
         * @return this builder instance
         */
        public Builder definedTagEquals(java.util.List<String> definedTagEquals) {
            this.definedTagEquals = definedTagEquals;
            return this;
        }

        /**
         * Singular setter. A list of tag filters to apply. Only resources with a defined tag
         * matching the value will be returned. Each item in the list has the format
         * "{namespace}.{tagName}.{value}". All inputs are case-insensitive. Multiple values for the
         * same key (i.e. same namespace and tag name) are interpreted as "OR". Values for different
         * keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder definedTagEquals(String singularValue) {
            return this.definedTagEquals(java.util.Arrays.asList(singularValue));
        }

        /**
         * A list of tag filters to apply. Only resources with a freeform tag matching the value
         * will be returned. The key for each tag is "{tagName}.{value}". All inputs are
         * case-insensitive. Multiple values for the same tag name are interpreted as "OR". Values
         * for different tag names are interpreted as "AND".
         */
        private java.util.List<String> freeformTagEquals = null;

        /**
         * A list of tag filters to apply. Only resources with a freeform tag matching the value
         * will be returned. The key for each tag is "{tagName}.{value}". All inputs are
         * case-insensitive. Multiple values for the same tag name are interpreted as "OR". Values
         * for different tag names are interpreted as "AND".
         *
         * @param freeformTagEquals the value to set
         * @return this builder instance
         */
        public Builder freeformTagEquals(java.util.List<String> freeformTagEquals) {
            this.freeformTagEquals = freeformTagEquals;
            return this;
        }

        /**
         * Singular setter. A list of tag filters to apply. Only resources with a freeform tag
         * matching the value will be returned. The key for each tag is "{tagName}.{value}". All
         * inputs are case-insensitive. Multiple values for the same tag name are interpreted as
         * "OR". Values for different tag names are interpreted as "AND".
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder freeformTagEquals(String singularValue) {
            return this.freeformTagEquals(java.util.Arrays.asList(singularValue));
        }

        /**
         * A list of tag existence filters to apply. Only resources for which the specified defined
         * tags exist will be returned. Each item in the list has the format
         * "{namespace}.{tagName}.true" (for checking existence of a defined tag) or
         * "{namespace}.true". All inputs are case-insensitive. Currently, only existence ("true" at
         * the end) is supported. Absence ("false" at the end) is not supported. Multiple values for
         * the same key (i.e. same namespace and tag name) are interpreted as "OR". Values for
         * different keys (i.e. different namespaces, different tag names, or both) are interpreted
         * as "AND".
         */
        private java.util.List<String> definedTagExists = null;

        /**
         * A list of tag existence filters to apply. Only resources for which the specified defined
         * tags exist will be returned. Each item in the list has the format
         * "{namespace}.{tagName}.true" (for checking existence of a defined tag) or
         * "{namespace}.true". All inputs are case-insensitive. Currently, only existence ("true" at
         * the end) is supported. Absence ("false" at the end) is not supported. Multiple values for
         * the same key (i.e. same namespace and tag name) are interpreted as "OR". Values for
         * different keys (i.e. different namespaces, different tag names, or both) are interpreted
         * as "AND".
         *
         * @param definedTagExists the value to set
         * @return this builder instance
         */
        public Builder definedTagExists(java.util.List<String> definedTagExists) {
            this.definedTagExists = definedTagExists;
            return this;
        }

        /**
         * Singular setter. A list of tag existence filters to apply. Only resources for which the
         * specified defined tags exist will be returned. Each item in the list has the format
         * "{namespace}.{tagName}.true" (for checking existence of a defined tag) or
         * "{namespace}.true". All inputs are case-insensitive. Currently, only existence ("true" at
         * the end) is supported. Absence ("false" at the end) is not supported. Multiple values for
         * the same key (i.e. same namespace and tag name) are interpreted as "OR". Values for
         * different keys (i.e. different namespaces, different tag names, or both) are interpreted
         * as "AND".
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder definedTagExists(String singularValue) {
            return this.definedTagExists(java.util.Arrays.asList(singularValue));
        }

        /**
         * A list of tag existence filters to apply. Only resources for which the specified freeform
         * tags exist the value will be returned. The key for each tag is "{tagName}.true". All
         * inputs are case-insensitive. Currently, only existence ("true" at the end) is supported.
         * Absence ("false" at the end) is not supported. Multiple values for different tag names
         * are interpreted as "AND".
         */
        private java.util.List<String> freeformTagExists = null;

        /**
         * A list of tag existence filters to apply. Only resources for which the specified freeform
         * tags exist the value will be returned. The key for each tag is "{tagName}.true". All
         * inputs are case-insensitive. Currently, only existence ("true" at the end) is supported.
         * Absence ("false" at the end) is not supported. Multiple values for different tag names
         * are interpreted as "AND".
         *
         * @param freeformTagExists the value to set
         * @return this builder instance
         */
        public Builder freeformTagExists(java.util.List<String> freeformTagExists) {
            this.freeformTagExists = freeformTagExists;
            return this;
        }

        /**
         * Singular setter. A list of tag existence filters to apply. Only resources for which the
         * specified freeform tags exist the value will be returned. The key for each tag is
         * "{tagName}.true". All inputs are case-insensitive. Currently, only existence ("true" at
         * the end) is supported. Absence ("false" at the end) is not supported. Multiple values for
         * different tag names are interpreted as "AND".
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder freeformTagExists(String singularValue) {
            return this.freeformTagExists(java.util.Arrays.asList(singularValue));
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
        public Builder copy(GetDatabaseFleetHealthMetricsRequest o) {
            compareBaselineTime(o.getCompareBaselineTime());
            compareTargetTime(o.getCompareTargetTime());
            opcRequestId(o.getOpcRequestId());
            managedDatabaseGroupId(o.getManagedDatabaseGroupId());
            compartmentId(o.getCompartmentId());
            compareType(o.getCompareType());
            filterByMetricNames(o.getFilterByMetricNames());
            filterByDatabaseType(o.getFilterByDatabaseType());
            filterByDatabaseSubType(o.getFilterByDatabaseSubType());
            page(o.getPage());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            filterByDatabaseDeploymentType(o.getFilterByDatabaseDeploymentType());
            filterByDatabaseVersion(o.getFilterByDatabaseVersion());
            definedTagEquals(o.getDefinedTagEquals());
            freeformTagEquals(o.getFreeformTagEquals());
            definedTagExists(o.getDefinedTagExists());
            freeformTagExists(o.getFreeformTagExists());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDatabaseFleetHealthMetricsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDatabaseFleetHealthMetricsRequest
         */
        public GetDatabaseFleetHealthMetricsRequest build() {
            GetDatabaseFleetHealthMetricsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDatabaseFleetHealthMetricsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDatabaseFleetHealthMetricsRequest
         */
        public GetDatabaseFleetHealthMetricsRequest buildWithoutInvocationCallback() {
            GetDatabaseFleetHealthMetricsRequest request =
                    new GetDatabaseFleetHealthMetricsRequest();
            request.compareBaselineTime = compareBaselineTime;
            request.compareTargetTime = compareTargetTime;
            request.opcRequestId = opcRequestId;
            request.managedDatabaseGroupId = managedDatabaseGroupId;
            request.compartmentId = compartmentId;
            request.compareType = compareType;
            request.filterByMetricNames = filterByMetricNames;
            request.filterByDatabaseType = filterByDatabaseType;
            request.filterByDatabaseSubType = filterByDatabaseSubType;
            request.page = page;
            request.limit = limit;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.filterByDatabaseDeploymentType = filterByDatabaseDeploymentType;
            request.filterByDatabaseVersion = filterByDatabaseVersion;
            request.definedTagEquals = definedTagEquals;
            request.freeformTagEquals = freeformTagEquals;
            request.definedTagExists = definedTagExists;
            request.freeformTagExists = freeformTagExists;
            return request;
            // new GetDatabaseFleetHealthMetricsRequest(compareBaselineTime, compareTargetTime,
            // opcRequestId, managedDatabaseGroupId, compartmentId, compareType,
            // filterByMetricNames, filterByDatabaseType, filterByDatabaseSubType, page, limit,
            // sortBy, sortOrder, filterByDatabaseDeploymentType, filterByDatabaseVersion,
            // definedTagEquals, freeformTagEquals, definedTagExists, freeformTagExists);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compareBaselineTime(compareBaselineTime)
                .compareTargetTime(compareTargetTime)
                .opcRequestId(opcRequestId)
                .managedDatabaseGroupId(managedDatabaseGroupId)
                .compartmentId(compartmentId)
                .compareType(compareType)
                .filterByMetricNames(filterByMetricNames)
                .filterByDatabaseType(filterByDatabaseType)
                .filterByDatabaseSubType(filterByDatabaseSubType)
                .page(page)
                .limit(limit)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .filterByDatabaseDeploymentType(filterByDatabaseDeploymentType)
                .filterByDatabaseVersion(filterByDatabaseVersion)
                .definedTagEquals(definedTagEquals)
                .freeformTagEquals(freeformTagEquals)
                .definedTagExists(definedTagExists)
                .freeformTagExists(freeformTagExists);
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
        sb.append(",compareBaselineTime=").append(String.valueOf(this.compareBaselineTime));
        sb.append(",compareTargetTime=").append(String.valueOf(this.compareTargetTime));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",managedDatabaseGroupId=").append(String.valueOf(this.managedDatabaseGroupId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",compareType=").append(String.valueOf(this.compareType));
        sb.append(",filterByMetricNames=").append(String.valueOf(this.filterByMetricNames));
        sb.append(",filterByDatabaseType=").append(String.valueOf(this.filterByDatabaseType));
        sb.append(",filterByDatabaseSubType=").append(String.valueOf(this.filterByDatabaseSubType));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",filterByDatabaseDeploymentType=")
                .append(String.valueOf(this.filterByDatabaseDeploymentType));
        sb.append(",filterByDatabaseVersion=").append(String.valueOf(this.filterByDatabaseVersion));
        sb.append(",definedTagEquals=").append(String.valueOf(this.definedTagEquals));
        sb.append(",freeformTagEquals=").append(String.valueOf(this.freeformTagEquals));
        sb.append(",definedTagExists=").append(String.valueOf(this.definedTagExists));
        sb.append(",freeformTagExists=").append(String.valueOf(this.freeformTagExists));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDatabaseFleetHealthMetricsRequest)) {
            return false;
        }

        GetDatabaseFleetHealthMetricsRequest other = (GetDatabaseFleetHealthMetricsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compareBaselineTime, other.compareBaselineTime)
                && java.util.Objects.equals(this.compareTargetTime, other.compareTargetTime)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.managedDatabaseGroupId, other.managedDatabaseGroupId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.compareType, other.compareType)
                && java.util.Objects.equals(this.filterByMetricNames, other.filterByMetricNames)
                && java.util.Objects.equals(this.filterByDatabaseType, other.filterByDatabaseType)
                && java.util.Objects.equals(
                        this.filterByDatabaseSubType, other.filterByDatabaseSubType)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(
                        this.filterByDatabaseDeploymentType, other.filterByDatabaseDeploymentType)
                && java.util.Objects.equals(
                        this.filterByDatabaseVersion, other.filterByDatabaseVersion)
                && java.util.Objects.equals(this.definedTagEquals, other.definedTagEquals)
                && java.util.Objects.equals(this.freeformTagEquals, other.freeformTagEquals)
                && java.util.Objects.equals(this.definedTagExists, other.definedTagExists)
                && java.util.Objects.equals(this.freeformTagExists, other.freeformTagExists);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compareBaselineTime == null
                                ? 43
                                : this.compareBaselineTime.hashCode());
        result =
                (result * PRIME)
                        + (this.compareTargetTime == null ? 43 : this.compareTargetTime.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedDatabaseGroupId == null
                                ? 43
                                : this.managedDatabaseGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.compareType == null ? 43 : this.compareType.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByMetricNames == null
                                ? 43
                                : this.filterByMetricNames.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByDatabaseType == null
                                ? 43
                                : this.filterByDatabaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByDatabaseSubType == null
                                ? 43
                                : this.filterByDatabaseSubType.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByDatabaseDeploymentType == null
                                ? 43
                                : this.filterByDatabaseDeploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByDatabaseVersion == null
                                ? 43
                                : this.filterByDatabaseVersion.hashCode());
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
        return result;
    }
}
