/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListFindingsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListFindingsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListFindingsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the security assessment. */
    private String securityAssessmentId;

    /** The OCID of the security assessment. */
    public String getSecurityAssessmentId() {
        return securityAssessmentId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** A filter to return only the findings that are marked as top findings. */
    private Boolean isTopFinding;

    /** A filter to return only the findings that are marked as top findings. */
    public Boolean getIsTopFinding() {
        return isTopFinding;
    }
    /** A filter to return only findings of a particular risk level. */
    private Severity severity;

    /** A filter to return only findings of a particular risk level. */
    public enum Severity implements com.oracle.bmc.http.internal.BmcEnum {
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),
        Evaluate("EVALUATE"),
        Advisory("ADVISORY"),
        Pass("PASS"),
        Deferred("DEFERRED"),
        ;

        private final String value;
        private static java.util.Map<String, Severity> map;

        static {
            map = new java.util.HashMap<>();
            for (Severity v : Severity.values()) {
                map.put(v.getValue(), v);
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Severity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Severity: " + key);
        }
    };

    /** A filter to return only findings of a particular risk level. */
    public Severity getSeverity() {
        return severity;
    }
    /**
     * A filter to return only findings that match the specified risk level(s). Use containsSeverity
     * parameter if need to filter by multiple risk levels.
     */
    private java.util.List<ContainsSeverity> containsSeverity;

    /**
     * A filter to return only findings that match the specified risk level(s). Use containsSeverity
     * parameter if need to filter by multiple risk levels.
     */
    public enum ContainsSeverity implements com.oracle.bmc.http.internal.BmcEnum {
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),
        Evaluate("EVALUATE"),
        Advisory("ADVISORY"),
        Pass("PASS"),
        Deferred("DEFERRED"),
        ;

        private final String value;
        private static java.util.Map<String, ContainsSeverity> map;

        static {
            map = new java.util.HashMap<>();
            for (ContainsSeverity v : ContainsSeverity.values()) {
                map.put(v.getValue(), v);
            }
        }

        ContainsSeverity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ContainsSeverity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ContainsSeverity: " + key);
        }
    };

    /**
     * A filter to return only findings that match the specified risk level(s). Use containsSeverity
     * parameter if need to filter by multiple risk levels.
     */
    public java.util.List<ContainsSeverity> getContainsSeverity() {
        return containsSeverity;
    }
    /** The category of the finding. */
    private String category;

    /** The category of the finding. */
    public String getCategory() {
        return category;
    }
    /** A filter to return only the findings that match the specified lifecycle states. */
    private com.oracle.bmc.datasafe.model.FindingLifecycleState lifecycleState;

    /** A filter to return only the findings that match the specified lifecycle states. */
    public com.oracle.bmc.datasafe.model.FindingLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** An optional filter to return only findings that match the specified reference. */
    private com.oracle.bmc.datasafe.model.SecurityAssessmentReferences references;

    /** An optional filter to return only findings that match the specified reference. */
    public com.oracle.bmc.datasafe.model.SecurityAssessmentReferences getReferences() {
        return references;
    }
    /**
     * An optional filter to return only findings that match the specified references. Use
     * containsReferences param if need to filter by multiple references.
     */
    private java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentReferences>
            containsReferences;

    /**
     * An optional filter to return only findings that match the specified references. Use
     * containsReferences param if need to filter by multiple references.
     */
    public java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentReferences>
            getContainsReferences() {
        return containsReferences;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** A filter to return only resources that match the specified compartment OCID. */
    private String compartmentId;

    /** A filter to return only resources that match the specified compartment OCID. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel'
     * setting.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel'
     * setting.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE
     * returns only those compartments for which the user has INSPECT permissions directly or
     * indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED
     * permissions are checked and no partial results are displayed.
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE
     * returns only those compartments for which the user has INSPECT permissions directly or
     * indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED
     * permissions are checked and no partial results are displayed.
     */
    public enum AccessLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Restricted("RESTRICTED"),
        Accessible("ACCESSIBLE"),
        ;

        private final String value;
        private static java.util.Map<String, AccessLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessLevel v : AccessLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        AccessLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AccessLevel: " + key);
        }
    };

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE
     * returns only those compartments for which the user has INSPECT permissions directly or
     * indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED
     * permissions are checked and no partial results are displayed.
     */
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    /** A filter to return only items related to a specific target OCID. */
    private String targetId;

    /** A filter to return only items related to a specific target OCID. */
    public String getTargetId() {
        return targetId;
    }
    /**
     * An optional filter to return only findings that match the specified target ids. Use this
     * parameter to filter by multiple target ids.
     */
    private java.util.List<String> targetIds;

    /**
     * An optional filter to return only findings that match the specified target ids. Use this
     * parameter to filter by multiple target ids.
     */
    public java.util.List<String> getTargetIds() {
        return targetIds;
    }
    /**
     * The scimQuery query parameter accepts filter expressions that use the syntax described in
     * Section 3.2.2.2 of the System for Cross-Domain Identity Management (SCIM) specification,
     * which is available at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM
     * filtering expressions, text, date, and time values must be enclosed in quotation marks, with
     * date and time values using ISO-8601 format. (Numeric and boolean values should not be
     * quoted.)
     *
     * <p>*Example:** | scimQuery=(severity eq 'high') and (targetId eq 'target_1')
     * scimQuery=(category eq "Users") and (targetId eq "target_1") scimQuery=(reference eq 'CIS')
     * and (targetId eq 'target_1')
     *
     * <p>Supported fields: severity findingKey reference targetId isTopFinding title category
     * remarks details summary isRiskModified
     */
    private String scimQuery;

    /**
     * The scimQuery query parameter accepts filter expressions that use the syntax described in
     * Section 3.2.2.2 of the System for Cross-Domain Identity Management (SCIM) specification,
     * which is available at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM
     * filtering expressions, text, date, and time values must be enclosed in quotation marks, with
     * date and time values using ISO-8601 format. (Numeric and boolean values should not be
     * quoted.)
     *
     * <p>*Example:** | scimQuery=(severity eq 'high') and (targetId eq 'target_1')
     * scimQuery=(category eq "Users") and (targetId eq "target_1") scimQuery=(reference eq 'CIS')
     * and (targetId eq 'target_1')
     *
     * <p>Supported fields: severity findingKey reference targetId isTopFinding title category
     * remarks details summary isRiskModified
     */
    public String getScimQuery() {
        return scimQuery;
    }
    /** Specifies a subset of fields to be returned in the response. */
    private java.util.List<Field> field;

    /** Specifies a subset of fields to be returned in the response. */
    public enum Field implements com.oracle.bmc.http.internal.BmcEnum {
        Severity("severity"),
        FindingKey("findingKey"),
        Reference("reference"),
        TargetId("targetId"),
        IsTopFinding("isTopFinding"),
        Title("title"),
        Category("category"),
        Remarks("remarks"),
        Details("details"),
        Summary("summary"),
        IsRiskModified("isRiskModified"),
        ;

        private final String value;
        private static java.util.Map<String, Field> map;

        static {
            map = new java.util.HashMap<>();
            for (Field v : Field.values()) {
                map.put(v.getValue(), v);
            }
        }

        Field(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Field create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Field: " + key);
        }
    };

    /** Specifies a subset of fields to be returned in the response. */
    public java.util.List<Field> getField() {
        return field;
    }
    /**
     * The field to sort by. You can specify only one sort order(sortOrder). The default order for
     * category is alphabetical.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order(sortOrder). The default order for
     * category is alphabetical.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Category("category"),
        FindingKey("findingKey"),
        Severity("severity"),
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
     * The field to sort by. You can specify only one sort order(sortOrder). The default order for
     * category is alphabetical.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Each finding in security assessment has an associated key (think of key as a finding's name).
     * For a given finding, the key will be the same across targets. The user can use these keys to
     * filter the findings.
     */
    private String findingKey;

    /**
     * Each finding in security assessment has an associated key (think of key as a finding's name).
     * For a given finding, the key will be the same across targets. The user can use these keys to
     * filter the findings.
     */
    public String getFindingKey() {
        return findingKey;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListFindingsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the security assessment. */
        private String securityAssessmentId = null;

        /**
         * The OCID of the security assessment.
         *
         * @param securityAssessmentId the value to set
         * @return this builder instance
         */
        public Builder securityAssessmentId(String securityAssessmentId) {
            this.securityAssessmentId = securityAssessmentId;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** A filter to return only the findings that are marked as top findings. */
        private Boolean isTopFinding = null;

        /**
         * A filter to return only the findings that are marked as top findings.
         *
         * @param isTopFinding the value to set
         * @return this builder instance
         */
        public Builder isTopFinding(Boolean isTopFinding) {
            this.isTopFinding = isTopFinding;
            return this;
        }

        /** A filter to return only findings of a particular risk level. */
        private Severity severity = null;

        /**
         * A filter to return only findings of a particular risk level.
         *
         * @param severity the value to set
         * @return this builder instance
         */
        public Builder severity(Severity severity) {
            this.severity = severity;
            return this;
        }

        /**
         * A filter to return only findings that match the specified risk level(s). Use
         * containsSeverity parameter if need to filter by multiple risk levels.
         */
        private java.util.List<ContainsSeverity> containsSeverity = null;

        /**
         * A filter to return only findings that match the specified risk level(s). Use
         * containsSeverity parameter if need to filter by multiple risk levels.
         *
         * @param containsSeverity the value to set
         * @return this builder instance
         */
        public Builder containsSeverity(java.util.List<ContainsSeverity> containsSeverity) {
            this.containsSeverity = containsSeverity;
            return this;
        }

        /**
         * Singular setter. A filter to return only findings that match the specified risk level(s).
         * Use containsSeverity parameter if need to filter by multiple risk levels.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder containsSeverity(ContainsSeverity singularValue) {
            return this.containsSeverity(java.util.Arrays.asList(singularValue));
        }

        /** The category of the finding. */
        private String category = null;

        /**
         * The category of the finding.
         *
         * @param category the value to set
         * @return this builder instance
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /** A filter to return only the findings that match the specified lifecycle states. */
        private com.oracle.bmc.datasafe.model.FindingLifecycleState lifecycleState = null;

        /**
         * A filter to return only the findings that match the specified lifecycle states.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datasafe.model.FindingLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** An optional filter to return only findings that match the specified reference. */
        private com.oracle.bmc.datasafe.model.SecurityAssessmentReferences references = null;

        /**
         * An optional filter to return only findings that match the specified reference.
         *
         * @param references the value to set
         * @return this builder instance
         */
        public Builder references(
                com.oracle.bmc.datasafe.model.SecurityAssessmentReferences references) {
            this.references = references;
            return this;
        }

        /**
         * An optional filter to return only findings that match the specified references. Use
         * containsReferences param if need to filter by multiple references.
         */
        private java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentReferences>
                containsReferences = null;

        /**
         * An optional filter to return only findings that match the specified references. Use
         * containsReferences param if need to filter by multiple references.
         *
         * @param containsReferences the value to set
         * @return this builder instance
         */
        public Builder containsReferences(
                java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentReferences>
                        containsReferences) {
            this.containsReferences = containsReferences;
            return this;
        }

        /**
         * Singular setter. An optional filter to return only findings that match the specified
         * references. Use containsReferences param if need to filter by multiple references.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder containsReferences(SecurityAssessmentReferences singularValue) {
            return this.containsReferences(java.util.Arrays.asList(singularValue));
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** A filter to return only resources that match the specified compartment OCID. */
        private String compartmentId = null;

        /**
         * A filter to return only resources that match the specified compartment OCID.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned. Depends on the
         * 'accessLevel' setting.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned. Depends on the
         * 'accessLevel' setting.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to
         * ACCESSIBLE returns only those compartments for which the user has INSPECT permissions
         * directly or indirectly (permissions can be on a resource in a subcompartment). When set
         * to RESTRICTED permissions are checked and no partial results are displayed.
         */
        private AccessLevel accessLevel = null;

        /**
         * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to
         * ACCESSIBLE returns only those compartments for which the user has INSPECT permissions
         * directly or indirectly (permissions can be on a resource in a subcompartment). When set
         * to RESTRICTED permissions are checked and no partial results are displayed.
         *
         * @param accessLevel the value to set
         * @return this builder instance
         */
        public Builder accessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        /** A filter to return only items related to a specific target OCID. */
        private String targetId = null;

        /**
         * A filter to return only items related to a specific target OCID.
         *
         * @param targetId the value to set
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * An optional filter to return only findings that match the specified target ids. Use this
         * parameter to filter by multiple target ids.
         */
        private java.util.List<String> targetIds = null;

        /**
         * An optional filter to return only findings that match the specified target ids. Use this
         * parameter to filter by multiple target ids.
         *
         * @param targetIds the value to set
         * @return this builder instance
         */
        public Builder targetIds(java.util.List<String> targetIds) {
            this.targetIds = targetIds;
            return this;
        }

        /**
         * Singular setter. An optional filter to return only findings that match the specified
         * target ids. Use this parameter to filter by multiple target ids.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder targetIds(String singularValue) {
            return this.targetIds(java.util.Arrays.asList(singularValue));
        }

        /**
         * The scimQuery query parameter accepts filter expressions that use the syntax described in
         * Section 3.2.2.2 of the System for Cross-Domain Identity Management (SCIM) specification,
         * which is available at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In
         * SCIM filtering expressions, text, date, and time values must be enclosed in quotation
         * marks, with date and time values using ISO-8601 format. (Numeric and boolean values
         * should not be quoted.)
         *
         * <p>*Example:** | scimQuery=(severity eq 'high') and (targetId eq 'target_1')
         * scimQuery=(category eq "Users") and (targetId eq "target_1") scimQuery=(reference eq
         * 'CIS') and (targetId eq 'target_1')
         *
         * <p>Supported fields: severity findingKey reference targetId isTopFinding title category
         * remarks details summary isRiskModified
         */
        private String scimQuery = null;

        /**
         * The scimQuery query parameter accepts filter expressions that use the syntax described in
         * Section 3.2.2.2 of the System for Cross-Domain Identity Management (SCIM) specification,
         * which is available at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In
         * SCIM filtering expressions, text, date, and time values must be enclosed in quotation
         * marks, with date and time values using ISO-8601 format. (Numeric and boolean values
         * should not be quoted.)
         *
         * <p>*Example:** | scimQuery=(severity eq 'high') and (targetId eq 'target_1')
         * scimQuery=(category eq "Users") and (targetId eq "target_1") scimQuery=(reference eq
         * 'CIS') and (targetId eq 'target_1')
         *
         * <p>Supported fields: severity findingKey reference targetId isTopFinding title category
         * remarks details summary isRiskModified
         *
         * @param scimQuery the value to set
         * @return this builder instance
         */
        public Builder scimQuery(String scimQuery) {
            this.scimQuery = scimQuery;
            return this;
        }

        /** Specifies a subset of fields to be returned in the response. */
        private java.util.List<Field> field = null;

        /**
         * Specifies a subset of fields to be returned in the response.
         *
         * @param field the value to set
         * @return this builder instance
         */
        public Builder field(java.util.List<Field> field) {
            this.field = field;
            return this;
        }

        /**
         * Singular setter. Specifies a subset of fields to be returned in the response.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder field(Field singularValue) {
            return this.field(java.util.Arrays.asList(singularValue));
        }

        /**
         * The field to sort by. You can specify only one sort order(sortOrder). The default order
         * for category is alphabetical.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sort order(sortOrder). The default order
         * for category is alphabetical.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either ascending (ASC) or descending (DESC). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Each finding in security assessment has an associated key (think of key as a finding's
         * name). For a given finding, the key will be the same across targets. The user can use
         * these keys to filter the findings.
         */
        private String findingKey = null;

        /**
         * Each finding in security assessment has an associated key (think of key as a finding's
         * name). For a given finding, the key will be the same across targets. The user can use
         * these keys to filter the findings.
         *
         * @param findingKey the value to set
         * @return this builder instance
         */
        public Builder findingKey(String findingKey) {
            this.findingKey = findingKey;
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
        public Builder copy(ListFindingsRequest o) {
            securityAssessmentId(o.getSecurityAssessmentId());
            opcRequestId(o.getOpcRequestId());
            isTopFinding(o.getIsTopFinding());
            severity(o.getSeverity());
            containsSeverity(o.getContainsSeverity());
            category(o.getCategory());
            lifecycleState(o.getLifecycleState());
            references(o.getReferences());
            containsReferences(o.getContainsReferences());
            limit(o.getLimit());
            page(o.getPage());
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            targetId(o.getTargetId());
            targetIds(o.getTargetIds());
            scimQuery(o.getScimQuery());
            field(o.getField());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            findingKey(o.getFindingKey());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListFindingsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListFindingsRequest
         */
        public ListFindingsRequest build() {
            ListFindingsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListFindingsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListFindingsRequest
         */
        public ListFindingsRequest buildWithoutInvocationCallback() {
            ListFindingsRequest request = new ListFindingsRequest();
            request.securityAssessmentId = securityAssessmentId;
            request.opcRequestId = opcRequestId;
            request.isTopFinding = isTopFinding;
            request.severity = severity;
            request.containsSeverity = containsSeverity;
            request.category = category;
            request.lifecycleState = lifecycleState;
            request.references = references;
            request.containsReferences = containsReferences;
            request.limit = limit;
            request.page = page;
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.targetId = targetId;
            request.targetIds = targetIds;
            request.scimQuery = scimQuery;
            request.field = field;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.findingKey = findingKey;
            return request;
            // new ListFindingsRequest(securityAssessmentId, opcRequestId, isTopFinding, severity,
            // containsSeverity, category, lifecycleState, references, containsReferences, limit,
            // page, compartmentId, compartmentIdInSubtree, accessLevel, targetId, targetIds,
            // scimQuery, field, sortBy, sortOrder, findingKey);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .securityAssessmentId(securityAssessmentId)
                .opcRequestId(opcRequestId)
                .isTopFinding(isTopFinding)
                .severity(severity)
                .containsSeverity(containsSeverity)
                .category(category)
                .lifecycleState(lifecycleState)
                .references(references)
                .containsReferences(containsReferences)
                .limit(limit)
                .page(page)
                .compartmentId(compartmentId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .targetId(targetId)
                .targetIds(targetIds)
                .scimQuery(scimQuery)
                .field(field)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .findingKey(findingKey);
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
        sb.append(",securityAssessmentId=").append(String.valueOf(this.securityAssessmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isTopFinding=").append(String.valueOf(this.isTopFinding));
        sb.append(",severity=").append(String.valueOf(this.severity));
        sb.append(",containsSeverity=").append(String.valueOf(this.containsSeverity));
        sb.append(",category=").append(String.valueOf(this.category));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",references=").append(String.valueOf(this.references));
        sb.append(",containsReferences=").append(String.valueOf(this.containsReferences));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",targetIds=").append(String.valueOf(this.targetIds));
        sb.append(",scimQuery=").append(String.valueOf(this.scimQuery));
        sb.append(",field=").append(String.valueOf(this.field));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",findingKey=").append(String.valueOf(this.findingKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListFindingsRequest)) {
            return false;
        }

        ListFindingsRequest other = (ListFindingsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.securityAssessmentId, other.securityAssessmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isTopFinding, other.isTopFinding)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.containsSeverity, other.containsSeverity)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.references, other.references)
                && java.util.Objects.equals(this.containsReferences, other.containsReferences)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetIds, other.targetIds)
                && java.util.Objects.equals(this.scimQuery, other.scimQuery)
                && java.util.Objects.equals(this.field, other.field)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.findingKey, other.findingKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.securityAssessmentId == null
                                ? 43
                                : this.securityAssessmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.isTopFinding == null ? 43 : this.isTopFinding.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result =
                (result * PRIME)
                        + (this.containsSeverity == null ? 43 : this.containsSeverity.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.references == null ? 43 : this.references.hashCode());
        result =
                (result * PRIME)
                        + (this.containsReferences == null
                                ? 43
                                : this.containsReferences.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetIds == null ? 43 : this.targetIds.hashCode());
        result = (result * PRIME) + (this.scimQuery == null ? 43 : this.scimQuery.hashCode());
        result = (result * PRIME) + (this.field == null ? 43 : this.field.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.findingKey == null ? 43 : this.findingKey.hashCode());
        return result;
    }
}
