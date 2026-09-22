/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListCryptoAssessmentCertificatesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListCryptoAssessmentCertificatesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListCryptoAssessmentCertificatesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    /** A filter to return only resources associated with the specified crypto assessment OCID. */
    private String assessmentId;

    /** A filter to return only resources associated with the specified crypto assessment OCID. */
    public String getAssessmentId() {
        return assessmentId;
    }
    /** A filter to return targets from assessments of the specified type. */
    private com.oracle.bmc.datasafe.model.CryptoAssessment.Type assessmentType;

    /** A filter to return targets from assessments of the specified type. */
    public com.oracle.bmc.datasafe.model.CryptoAssessment.Type getAssessmentType() {
        return assessmentType;
    }
    /** A filter to return only inventory rows associated with the specified target OCID. */
    private String targetId;

    /** A filter to return only inventory rows associated with the specified target OCID. */
    public String getTargetId() {
        return targetId;
    }
    /** A filter to return only resources associated with any of the specified target OCIDs. */
    private java.util.List<String> targetIds;

    /** A filter to return only resources associated with any of the specified target OCIDs. */
    public java.util.List<String> getTargetIds() {
        return targetIds;
    }
    /** A filter to return only certificates of any of the specified types. */
    private java.util.List<
                    com.oracle.bmc.datasafe.model.CryptoAssessmentCertificateSummary
                            .CertificateType>
            certificateType;

    /** A filter to return only certificates of any of the specified types. */
    public java.util.List<
                    com.oracle.bmc.datasafe.model.CryptoAssessmentCertificateSummary
                            .CertificateType>
            getCertificateType() {
        return certificateType;
    }
    /** A filter to return only certificates with any of the specified statuses. */
    private java.util.List<com.oracle.bmc.datasafe.model.CryptoAssessmentCertificateSummary.Status>
            status;

    /** A filter to return only certificates with any of the specified statuses. */
    public java.util.List<com.oracle.bmc.datasafe.model.CryptoAssessmentCertificateSummary.Status>
            getStatus() {
        return status;
    }
    /**
     * A filter to return only certificates with any of the specified public key types. Stored
     * values are normalized forms such as RSA2048, RSA4096, or EC256.
     */
    private java.util.List<String> publicKeyType;

    /**
     * A filter to return only certificates with any of the specified public key types. Stored
     * values are normalized forms such as RSA2048, RSA4096, or EC256.
     */
    public java.util.List<String> getPublicKeyType() {
        return publicKeyType;
    }
    /**
     * A filter to return only certificates whose signature algorithm contains any of the specified
     * values. For example, use SHA1 to match SHA1-based certificate signatures.
     */
    private java.util.List<String> signatureAlgorithm;

    /**
     * A filter to return only certificates whose signature algorithm contains any of the specified
     * values. For example, use SHA1 to match SHA1-based certificate signatures.
     */
    public java.util.List<String> getSignatureAlgorithm() {
        return signatureAlgorithm;
    }
    /**
     * A filter to return only certificates in the specified expiry bucket. Supported values are
     * 0_15, 15_30, 30_60, 60_90, and 90_PLUS.
     */
    private String expiryBucket;

    /**
     * A filter to return only certificates in the specified expiry bucket. Supported values are
     * 0_15, 15_30, 30_60, 60_90, and 90_PLUS.
     */
    public String getExpiryBucket() {
        return expiryBucket;
    }
    /**
     * A filter to return certificates whose validTill timestamp is on or before the current time
     * plus the specified number of days. Negative values are allowed and filter certificates that
     * expired on or before that many days ago.
     */
    private Integer daysToExpiry;

    /**
     * A filter to return certificates whose validTill timestamp is on or before the current time
     * plus the specified number of days. Negative values are allowed and filter certificates that
     * expired on or before that many days ago.
     */
    public Integer getDaysToExpiry() {
        return daysToExpiry;
    }
    /** The field used to sort certificate results. */
    private SortBy sortBy;

    /** The field used to sort certificate results. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeValidUntil("timeValidUntil"),
        Subject("subject"),
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

    /** The field used to sort certificate results. */
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
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCryptoAssessmentCertificatesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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

        /**
         * A filter to return only resources associated with the specified crypto assessment OCID.
         */
        private String assessmentId = null;

        /**
         * A filter to return only resources associated with the specified crypto assessment OCID.
         *
         * @param assessmentId the value to set
         * @return this builder instance
         */
        public Builder assessmentId(String assessmentId) {
            this.assessmentId = assessmentId;
            return this;
        }

        /** A filter to return targets from assessments of the specified type. */
        private com.oracle.bmc.datasafe.model.CryptoAssessment.Type assessmentType = null;

        /**
         * A filter to return targets from assessments of the specified type.
         *
         * @param assessmentType the value to set
         * @return this builder instance
         */
        public Builder assessmentType(
                com.oracle.bmc.datasafe.model.CryptoAssessment.Type assessmentType) {
            this.assessmentType = assessmentType;
            return this;
        }

        /** A filter to return only inventory rows associated with the specified target OCID. */
        private String targetId = null;

        /**
         * A filter to return only inventory rows associated with the specified target OCID.
         *
         * @param targetId the value to set
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /** A filter to return only resources associated with any of the specified target OCIDs. */
        private java.util.List<String> targetIds = null;

        /**
         * A filter to return only resources associated with any of the specified target OCIDs.
         *
         * @param targetIds the value to set
         * @return this builder instance
         */
        public Builder targetIds(java.util.List<String> targetIds) {
            this.targetIds = targetIds;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources associated with any of the specified
         * target OCIDs.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder targetIds(String singularValue) {
            return this.targetIds(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only certificates of any of the specified types. */
        private java.util.List<
                        com.oracle.bmc.datasafe.model.CryptoAssessmentCertificateSummary
                                .CertificateType>
                certificateType = null;

        /**
         * A filter to return only certificates of any of the specified types.
         *
         * @param certificateType the value to set
         * @return this builder instance
         */
        public Builder certificateType(
                java.util.List<
                                com.oracle.bmc.datasafe.model.CryptoAssessmentCertificateSummary
                                        .CertificateType>
                        certificateType) {
            this.certificateType = certificateType;
            return this;
        }

        /**
         * Singular setter. A filter to return only certificates of any of the specified types.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder certificateType(
                com.oracle.bmc.datasafe.model.CryptoAssessmentCertificateSummary.CertificateType
                        singularValue) {
            return this.certificateType(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only certificates with any of the specified statuses. */
        private java.util.List<
                        com.oracle.bmc.datasafe.model.CryptoAssessmentCertificateSummary.Status>
                status = null;

        /**
         * A filter to return only certificates with any of the specified statuses.
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                java.util.List<
                                com.oracle.bmc.datasafe.model.CryptoAssessmentCertificateSummary
                                        .Status>
                        status) {
            this.status = status;
            return this;
        }

        /**
         * Singular setter. A filter to return only certificates with any of the specified statuses.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder status(
                com.oracle.bmc.datasafe.model.CryptoAssessmentCertificateSummary.Status
                        singularValue) {
            return this.status(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only certificates with any of the specified public key types. Stored
         * values are normalized forms such as RSA2048, RSA4096, or EC256.
         */
        private java.util.List<String> publicKeyType = null;

        /**
         * A filter to return only certificates with any of the specified public key types. Stored
         * values are normalized forms such as RSA2048, RSA4096, or EC256.
         *
         * @param publicKeyType the value to set
         * @return this builder instance
         */
        public Builder publicKeyType(java.util.List<String> publicKeyType) {
            this.publicKeyType = publicKeyType;
            return this;
        }

        /**
         * Singular setter. A filter to return only certificates with any of the specified public
         * key types. Stored values are normalized forms such as RSA2048, RSA4096, or EC256.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder publicKeyType(String singularValue) {
            return this.publicKeyType(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only certificates whose signature algorithm contains any of the
         * specified values. For example, use SHA1 to match SHA1-based certificate signatures.
         */
        private java.util.List<String> signatureAlgorithm = null;

        /**
         * A filter to return only certificates whose signature algorithm contains any of the
         * specified values. For example, use SHA1 to match SHA1-based certificate signatures.
         *
         * @param signatureAlgorithm the value to set
         * @return this builder instance
         */
        public Builder signatureAlgorithm(java.util.List<String> signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }

        /**
         * Singular setter. A filter to return only certificates whose signature algorithm contains
         * any of the specified values. For example, use SHA1 to match SHA1-based certificate
         * signatures.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder signatureAlgorithm(String singularValue) {
            return this.signatureAlgorithm(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only certificates in the specified expiry bucket. Supported values are
         * 0_15, 15_30, 30_60, 60_90, and 90_PLUS.
         */
        private String expiryBucket = null;

        /**
         * A filter to return only certificates in the specified expiry bucket. Supported values are
         * 0_15, 15_30, 30_60, 60_90, and 90_PLUS.
         *
         * @param expiryBucket the value to set
         * @return this builder instance
         */
        public Builder expiryBucket(String expiryBucket) {
            this.expiryBucket = expiryBucket;
            return this;
        }

        /**
         * A filter to return certificates whose validTill timestamp is on or before the current
         * time plus the specified number of days. Negative values are allowed and filter
         * certificates that expired on or before that many days ago.
         */
        private Integer daysToExpiry = null;

        /**
         * A filter to return certificates whose validTill timestamp is on or before the current
         * time plus the specified number of days. Negative values are allowed and filter
         * certificates that expired on or before that many days ago.
         *
         * @param daysToExpiry the value to set
         * @return this builder instance
         */
        public Builder daysToExpiry(Integer daysToExpiry) {
            this.daysToExpiry = daysToExpiry;
            return this;
        }

        /** The field used to sort certificate results. */
        private SortBy sortBy = null;

        /**
         * The field used to sort certificate results.
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
        public Builder copy(ListCryptoAssessmentCertificatesRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            assessmentId(o.getAssessmentId());
            assessmentType(o.getAssessmentType());
            targetId(o.getTargetId());
            targetIds(o.getTargetIds());
            certificateType(o.getCertificateType());
            status(o.getStatus());
            publicKeyType(o.getPublicKeyType());
            signatureAlgorithm(o.getSignatureAlgorithm());
            expiryBucket(o.getExpiryBucket());
            daysToExpiry(o.getDaysToExpiry());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCryptoAssessmentCertificatesRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListCryptoAssessmentCertificatesRequest
         */
        public ListCryptoAssessmentCertificatesRequest build() {
            ListCryptoAssessmentCertificatesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCryptoAssessmentCertificatesRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCryptoAssessmentCertificatesRequest
         */
        public ListCryptoAssessmentCertificatesRequest buildWithoutInvocationCallback() {
            ListCryptoAssessmentCertificatesRequest request =
                    new ListCryptoAssessmentCertificatesRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.assessmentId = assessmentId;
            request.assessmentType = assessmentType;
            request.targetId = targetId;
            request.targetIds = targetIds;
            request.certificateType = certificateType;
            request.status = status;
            request.publicKeyType = publicKeyType;
            request.signatureAlgorithm = signatureAlgorithm;
            request.expiryBucket = expiryBucket;
            request.daysToExpiry = daysToExpiry;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListCryptoAssessmentCertificatesRequest(compartmentId, compartmentIdInSubtree,
            // accessLevel, assessmentId, assessmentType, targetId, targetIds, certificateType,
            // status, publicKeyType, signatureAlgorithm, expiryBucket, daysToExpiry, sortBy,
            // sortOrder, opcRequestId, limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .assessmentId(assessmentId)
                .assessmentType(assessmentType)
                .targetId(targetId)
                .targetIds(targetIds)
                .certificateType(certificateType)
                .status(status)
                .publicKeyType(publicKeyType)
                .signatureAlgorithm(signatureAlgorithm)
                .expiryBucket(expiryBucket)
                .daysToExpiry(daysToExpiry)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",assessmentId=").append(String.valueOf(this.assessmentId));
        sb.append(",assessmentType=").append(String.valueOf(this.assessmentType));
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",targetIds=").append(String.valueOf(this.targetIds));
        sb.append(",certificateType=").append(String.valueOf(this.certificateType));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",publicKeyType=").append(String.valueOf(this.publicKeyType));
        sb.append(",signatureAlgorithm=").append(String.valueOf(this.signatureAlgorithm));
        sb.append(",expiryBucket=").append(String.valueOf(this.expiryBucket));
        sb.append(",daysToExpiry=").append(String.valueOf(this.daysToExpiry));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCryptoAssessmentCertificatesRequest)) {
            return false;
        }

        ListCryptoAssessmentCertificatesRequest other = (ListCryptoAssessmentCertificatesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && java.util.Objects.equals(this.assessmentType, other.assessmentType)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetIds, other.targetIds)
                && java.util.Objects.equals(this.certificateType, other.certificateType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.publicKeyType, other.publicKeyType)
                && java.util.Objects.equals(this.signatureAlgorithm, other.signatureAlgorithm)
                && java.util.Objects.equals(this.expiryBucket, other.expiryBucket)
                && java.util.Objects.equals(this.daysToExpiry, other.daysToExpiry)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
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
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.assessmentId == null ? 43 : this.assessmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.assessmentType == null ? 43 : this.assessmentType.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetIds == null ? 43 : this.targetIds.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateType == null ? 43 : this.certificateType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.publicKeyType == null ? 43 : this.publicKeyType.hashCode());
        result =
                (result * PRIME)
                        + (this.signatureAlgorithm == null
                                ? 43
                                : this.signatureAlgorithm.hashCode());
        result = (result * PRIME) + (this.expiryBucket == null ? 43 : this.expiryBucket.hashCode());
        result = (result * PRIME) + (this.daysToExpiry == null ? 43 : this.daysToExpiry.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
