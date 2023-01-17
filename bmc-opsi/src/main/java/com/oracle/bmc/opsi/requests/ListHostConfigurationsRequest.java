/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListHostConfigurationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListHostConfigurationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ListHostConfigurationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Unique Enterprise Manager bridge identifier
     */
    private String enterpriseManagerBridgeId;

    /**
     * Unique Enterprise Manager bridge identifier
     */
    public String getEnterpriseManagerBridgeId() {
        return enterpriseManagerBridgeId;
    }
    /**
     * Optional list of host insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    private java.util.List<String> id;

    /**
     * Optional list of host insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    public java.util.List<String> getId() {
        return id;
    }
    /**
     * Optional list of exadata insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    private java.util.List<String> exadataInsightId;

    /**
     * Optional list of exadata insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    public java.util.List<String> getExadataInsightId() {
        return exadataInsightId;
    }
    /**
     * Filter by one or more platform types.
     * Supported platformType(s) for MACS-managed external host insight: [LINUX].
     * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
     *
     */
    private java.util.List<PlatformType> platformType;

    /**
     * Filter by one or more platform types.
     * Supported platformType(s) for MACS-managed external host insight: [LINUX].
     * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
     *
     **/
    public enum PlatformType {
        Linux("LINUX"),
        Solaris("SOLARIS"),
        Sunos("SUNOS"),
        Zlinux("ZLINUX"),
        ;

        private final String value;
        private static java.util.Map<String, PlatformType> map;

        static {
            map = new java.util.HashMap<>();
            for (PlatformType v : PlatformType.values()) {
                map.put(v.getValue(), v);
            }
        }

        PlatformType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlatformType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PlatformType: " + key);
        }
    };

    /**
     * Filter by one or more platform types.
     * Supported platformType(s) for MACS-managed external host insight: [LINUX].
     * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
     *
     */
    public java.util.List<PlatformType> getPlatformType() {
        return platformType;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private com.oracle.bmc.opsi.model.SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    public com.oracle.bmc.opsi.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Host configuration list sort options.
     *
     */
    private SortBy sortBy;

    /**
     * Host configuration list sort options.
     *
     **/
    public enum SortBy {
        HostName("hostName"),
        PlatformType("platformType"),
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
     * Host configuration list sort options.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
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
    /**
     * Filter by one or more host types.
     * Possible values are CLOUD-HOST, EXTERNAL-HOST
     *
     */
    private java.util.List<String> hostType;

    /**
     * Filter by one or more host types.
     * Possible values are CLOUD-HOST, EXTERNAL-HOST
     *
     */
    public java.util.List<String> getHostType() {
        return hostType;
    }
    /**
     * Optional [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the host (Compute Id)
     *
     */
    private String hostId;

    /**
     * Optional [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the host (Compute Id)
     *
     */
    public String getHostId() {
        return hostId;
    }
    /**
     * Optional list of Exadata Insight VM cluster name.
     *
     */
    private java.util.List<String> vmclusterName;

    /**
     * Optional list of Exadata Insight VM cluster name.
     *
     */
    public java.util.List<String> getVmclusterName() {
        return vmclusterName;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListHostConfigurationsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Unique Enterprise Manager bridge identifier
         */
        private String enterpriseManagerBridgeId = null;

        /**
         * Unique Enterprise Manager bridge identifier
         * @param enterpriseManagerBridgeId the value to set
         * @return this builder instance
         */
        public Builder enterpriseManagerBridgeId(String enterpriseManagerBridgeId) {
            this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            return this;
        }

        /**
         * Optional list of host insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         */
        private java.util.List<String> id = null;

        /**
         * Optional list of host insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(java.util.List<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Singular setter. Optional list of host insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder id(String singularValue) {
            return this.id(java.util.Arrays.asList(singularValue));
        }

        /**
         * Optional list of exadata insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         */
        private java.util.List<String> exadataInsightId = null;

        /**
         * Optional list of exadata insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param exadataInsightId the value to set
         * @return this builder instance
         */
        public Builder exadataInsightId(java.util.List<String> exadataInsightId) {
            this.exadataInsightId = exadataInsightId;
            return this;
        }

        /**
         * Singular setter. Optional list of exadata insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder exadataInsightId(String singularValue) {
            return this.exadataInsightId(java.util.Arrays.asList(singularValue));
        }

        /**
         * Filter by one or more platform types.
         * Supported platformType(s) for MACS-managed external host insight: [LINUX].
         * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
         * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
         *
         */
        private java.util.List<PlatformType> platformType = null;

        /**
         * Filter by one or more platform types.
         * Supported platformType(s) for MACS-managed external host insight: [LINUX].
         * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
         * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
         *
         * @param platformType the value to set
         * @return this builder instance
         */
        public Builder platformType(java.util.List<PlatformType> platformType) {
            this.platformType = platformType;
            return this;
        }

        /**
         * Singular setter. Filter by one or more platform types.
         * Supported platformType(s) for MACS-managed external host insight: [LINUX].
         * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
         * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder platformType(PlatformType singularValue) {
            return this.platformType(java.util.Arrays.asList(singularValue));
        }

        /**
         * For list pagination. The maximum number of results per page, or items to
         * return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to
         * return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
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
         * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         */
        private com.oracle.bmc.opsi.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.opsi.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Host configuration list sort options.
         *
         */
        private SortBy sortBy = null;

        /**
         * Host configuration list sort options.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
         * Filter by one or more host types.
         * Possible values are CLOUD-HOST, EXTERNAL-HOST
         *
         */
        private java.util.List<String> hostType = null;

        /**
         * Filter by one or more host types.
         * Possible values are CLOUD-HOST, EXTERNAL-HOST
         *
         * @param hostType the value to set
         * @return this builder instance
         */
        public Builder hostType(java.util.List<String> hostType) {
            this.hostType = hostType;
            return this;
        }

        /**
         * Singular setter. Filter by one or more host types.
         * Possible values are CLOUD-HOST, EXTERNAL-HOST
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder hostType(String singularValue) {
            return this.hostType(java.util.Arrays.asList(singularValue));
        }

        /**
         * Optional [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the host (Compute Id)
         *
         */
        private String hostId = null;

        /**
         * Optional [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the host (Compute Id)
         *
         * @param hostId the value to set
         * @return this builder instance
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * Optional list of Exadata Insight VM cluster name.
         *
         */
        private java.util.List<String> vmclusterName = null;

        /**
         * Optional list of Exadata Insight VM cluster name.
         *
         * @param vmclusterName the value to set
         * @return this builder instance
         */
        public Builder vmclusterName(java.util.List<String> vmclusterName) {
            this.vmclusterName = vmclusterName;
            return this;
        }

        /**
         * Singular setter. Optional list of Exadata Insight VM cluster name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder vmclusterName(String singularValue) {
            return this.vmclusterName(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListHostConfigurationsRequest o) {
            compartmentId(o.getCompartmentId());
            enterpriseManagerBridgeId(o.getEnterpriseManagerBridgeId());
            id(o.getId());
            exadataInsightId(o.getExadataInsightId());
            platformType(o.getPlatformType());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            definedTagEquals(o.getDefinedTagEquals());
            freeformTagEquals(o.getFreeformTagEquals());
            definedTagExists(o.getDefinedTagExists());
            freeformTagExists(o.getFreeformTagExists());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            hostType(o.getHostType());
            hostId(o.getHostId());
            vmclusterName(o.getVmclusterName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListHostConfigurationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListHostConfigurationsRequest
         */
        public ListHostConfigurationsRequest build() {
            ListHostConfigurationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListHostConfigurationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListHostConfigurationsRequest
         */
        public ListHostConfigurationsRequest buildWithoutInvocationCallback() {
            ListHostConfigurationsRequest request = new ListHostConfigurationsRequest();
            request.compartmentId = compartmentId;
            request.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            request.id = id;
            request.exadataInsightId = exadataInsightId;
            request.platformType = platformType;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.definedTagEquals = definedTagEquals;
            request.freeformTagEquals = freeformTagEquals;
            request.definedTagExists = definedTagExists;
            request.freeformTagExists = freeformTagExists;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.hostType = hostType;
            request.hostId = hostId;
            request.vmclusterName = vmclusterName;
            return request;
            // new ListHostConfigurationsRequest(compartmentId, enterpriseManagerBridgeId, id, exadataInsightId, platformType, limit, page, sortOrder, sortBy, opcRequestId, definedTagEquals, freeformTagEquals, definedTagExists, freeformTagExists, compartmentIdInSubtree, hostType, hostId, vmclusterName);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .enterpriseManagerBridgeId(enterpriseManagerBridgeId)
                .id(id)
                .exadataInsightId(exadataInsightId)
                .platformType(platformType)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .definedTagEquals(definedTagEquals)
                .freeformTagEquals(freeformTagEquals)
                .definedTagExists(definedTagExists)
                .freeformTagExists(freeformTagExists)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .hostType(hostType)
                .hostId(hostId)
                .vmclusterName(vmclusterName);
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
        sb.append(",enterpriseManagerBridgeId=")
                .append(String.valueOf(this.enterpriseManagerBridgeId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",exadataInsightId=").append(String.valueOf(this.exadataInsightId));
        sb.append(",platformType=").append(String.valueOf(this.platformType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",definedTagEquals=").append(String.valueOf(this.definedTagEquals));
        sb.append(",freeformTagEquals=").append(String.valueOf(this.freeformTagEquals));
        sb.append(",definedTagExists=").append(String.valueOf(this.definedTagExists));
        sb.append(",freeformTagExists=").append(String.valueOf(this.freeformTagExists));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",hostType=").append(String.valueOf(this.hostType));
        sb.append(",hostId=").append(String.valueOf(this.hostId));
        sb.append(",vmclusterName=").append(String.valueOf(this.vmclusterName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListHostConfigurationsRequest)) {
            return false;
        }

        ListHostConfigurationsRequest other = (ListHostConfigurationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.enterpriseManagerBridgeId, other.enterpriseManagerBridgeId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.exadataInsightId, other.exadataInsightId)
                && java.util.Objects.equals(this.platformType, other.platformType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.definedTagEquals, other.definedTagEquals)
                && java.util.Objects.equals(this.freeformTagEquals, other.freeformTagEquals)
                && java.util.Objects.equals(this.definedTagExists, other.definedTagExists)
                && java.util.Objects.equals(this.freeformTagExists, other.freeformTagExists)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.hostType, other.hostType)
                && java.util.Objects.equals(this.hostId, other.hostId)
                && java.util.Objects.equals(this.vmclusterName, other.vmclusterName);
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
                        + (this.enterpriseManagerBridgeId == null
                                ? 43
                                : this.enterpriseManagerBridgeId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataInsightId == null ? 43 : this.exadataInsightId.hashCode());
        result = (result * PRIME) + (this.platformType == null ? 43 : this.platformType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
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
        result = (result * PRIME) + (this.hostType == null ? 43 : this.hostType.hashCode());
        result = (result * PRIME) + (this.hostId == null ? 43 : this.hostId.hashCode());
        result =
                (result * PRIME)
                        + (this.vmclusterName == null ? 43 : this.vmclusterName.hashCode());
        return result;
    }
}
