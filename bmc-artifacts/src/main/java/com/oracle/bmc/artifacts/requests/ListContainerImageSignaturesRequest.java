/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.requests;

import com.oracle.bmc.artifacts.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/ListContainerImageSignaturesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListContainerImageSignaturesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListContainerImageSignaturesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * When set to true, the hierarchy of compartments is traversed
     * and all compartments and subcompartments in the tenancy are
     * inspected depending on the the setting of {@code accessLevel}.
     * Default is false. Can only be set to true when calling the API
     * on the tenancy (root compartment).
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * When set to true, the hierarchy of compartments is traversed
     * and all compartments and subcompartments in the tenancy are
     * inspected depending on the the setting of {@code accessLevel}.
     * Default is false. Can only be set to true when calling the API
     * on the tenancy (root compartment).
     *
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * A filter to return a container image summary only for the specified container image OCID.
     *
     */
    private String imageId;

    /**
     * A filter to return a container image summary only for the specified container image OCID.
     *
     */
    public String getImageId() {
        return imageId;
    }
    /**
     * A filter to return container images only for the specified container repository OCID.
     *
     */
    private String repositoryId;

    /**
     * A filter to return container images only for the specified container repository OCID.
     *
     */
    public String getRepositoryId() {
        return repositoryId;
    }
    /**
     * A filter to return container images or container image signatures that match the repository name.
     * <p>
     * Example: {@code foo} or {@code foo*}
     *
     */
    private String repositoryName;

    /**
     * A filter to return container images or container image signatures that match the repository name.
     * <p>
     * Example: {@code foo} or {@code foo*}
     *
     */
    public String getRepositoryName() {
        return repositoryName;
    }
    /**
     * The digest of the container image.
     * <p>
     * Example: {@code sha256:e7d38b3517548a1c71e41bffe9c8ae6d6d29546ce46bf62159837aad072c90aa}
     *
     */
    private String imageDigest;

    /**
     * The digest of the container image.
     * <p>
     * Example: {@code sha256:e7d38b3517548a1c71e41bffe9c8ae6d6d29546ce46bf62159837aad072c90aa}
     *
     */
    public String getImageDigest() {
        return imageDigest;
    }
    /**
     * A filter to return only resources that match the given display name exactly.
     *
     */
    private String displayName;

    /**
     * A filter to return only resources that match the given display name exactly.
     *
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the kmsKeyVersionId used to sign the container image.
     * <p>
     * Example: {@code ocid1.keyversion.oc1..exampleuniqueID}
     *
     */
    private String kmsKeyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the kmsKeyVersionId used to sign the container image.
     * <p>
     * Example: {@code ocid1.keyversion.oc1..exampleuniqueID}
     *
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the kmsKeyVersionId used to sign the container image.
     * <p>
     * Example: {@code ocid1.keyversion.oc1..exampleuniqueID}
     *
     */
    private String kmsKeyVersionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the kmsKeyVersionId used to sign the container image.
     * <p>
     * Example: {@code ocid1.keyversion.oc1..exampleuniqueID}
     *
     */
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
    }
    /**
     * The algorithm to be used for signing. These are the only supported signing algorithms for container images.
     */
    private SigningAlgorithm signingAlgorithm;

    /**
     * The algorithm to be used for signing. These are the only supported signing algorithms for container images.
     **/
    public enum SigningAlgorithm {
        Sha224RsaPkcsPss("SHA_224_RSA_PKCS_PSS"),
        Sha256RsaPkcsPss("SHA_256_RSA_PKCS_PSS"),
        Sha384RsaPkcsPss("SHA_384_RSA_PKCS_PSS"),
        Sha512RsaPkcsPss("SHA_512_RSA_PKCS_PSS"),
        ;

        private final String value;
        private static java.util.Map<String, SigningAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (SigningAlgorithm v : SigningAlgorithm.values()) {
                map.put(v.getValue(), v);
            }
        }

        SigningAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SigningAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SigningAlgorithm: " + key);
        }
    };

    /**
     * The algorithm to be used for signing. These are the only supported signing algorithms for container images.
     */
    public SigningAlgorithm getSigningAlgorithm() {
        return signingAlgorithm;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
     * call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
     * call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by availability domain if the scope of the resource type is within a
     * single availability domain. If you call one of these "List" operations without specifying
     * an availability domain, the resources are grouped by availability domain, then sorted.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by availability domain if the scope of the resource type is within a
     * single availability domain. If you call one of these "List" operations without specifying
     * an availability domain, the resources are grouped by availability domain, then sorted.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by availability domain if the scope of the resource type is within a
     * single availability domain. If you call one of these "List" operations without specifying
     * an availability domain, the resources are grouped by availability domain, then sorted.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The DISPLAYNAME sort order
     * is case sensitive.
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The DISPLAYNAME sort order
     * is case sensitive.
     *
     **/
    public enum SortOrder {
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

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The DISPLAYNAME sort order
     * is case sensitive.
     *
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListContainerImageSignaturesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * When set to true, the hierarchy of compartments is traversed
         * and all compartments and subcompartments in the tenancy are
         * inspected depending on the the setting of {@code accessLevel}.
         * Default is false. Can only be set to true when calling the API
         * on the tenancy (root compartment).
         *
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * When set to true, the hierarchy of compartments is traversed
         * and all compartments and subcompartments in the tenancy are
         * inspected depending on the the setting of {@code accessLevel}.
         * Default is false. Can only be set to true when calling the API
         * on the tenancy (root compartment).
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * A filter to return a container image summary only for the specified container image OCID.
         *
         */
        private String imageId = null;

        /**
         * A filter to return a container image summary only for the specified container image OCID.
         *
         * @param imageId the value to set
         * @return this builder instance
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * A filter to return container images only for the specified container repository OCID.
         *
         */
        private String repositoryId = null;

        /**
         * A filter to return container images only for the specified container repository OCID.
         *
         * @param repositoryId the value to set
         * @return this builder instance
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * A filter to return container images or container image signatures that match the repository name.
         * <p>
         * Example: {@code foo} or {@code foo*}
         *
         */
        private String repositoryName = null;

        /**
         * A filter to return container images or container image signatures that match the repository name.
         * <p>
         * Example: {@code foo} or {@code foo*}
         *
         * @param repositoryName the value to set
         * @return this builder instance
         */
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        /**
         * The digest of the container image.
         * <p>
         * Example: {@code sha256:e7d38b3517548a1c71e41bffe9c8ae6d6d29546ce46bf62159837aad072c90aa}
         *
         */
        private String imageDigest = null;

        /**
         * The digest of the container image.
         * <p>
         * Example: {@code sha256:e7d38b3517548a1c71e41bffe9c8ae6d6d29546ce46bf62159837aad072c90aa}
         *
         * @param imageDigest the value to set
         * @return this builder instance
         */
        public Builder imageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * A filter to return only resources that match the given display name exactly.
         *
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the given display name exactly.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the kmsKeyVersionId used to sign the container image.
         * <p>
         * Example: {@code ocid1.keyversion.oc1..exampleuniqueID}
         *
         */
        private String kmsKeyId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the kmsKeyVersionId used to sign the container image.
         * <p>
         * Example: {@code ocid1.keyversion.oc1..exampleuniqueID}
         *
         * @param kmsKeyId the value to set
         * @return this builder instance
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the kmsKeyVersionId used to sign the container image.
         * <p>
         * Example: {@code ocid1.keyversion.oc1..exampleuniqueID}
         *
         */
        private String kmsKeyVersionId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the kmsKeyVersionId used to sign the container image.
         * <p>
         * Example: {@code ocid1.keyversion.oc1..exampleuniqueID}
         *
         * @param kmsKeyVersionId the value to set
         * @return this builder instance
         */
        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            return this;
        }

        /**
         * The algorithm to be used for signing. These are the only supported signing algorithms for container images.
         */
        private SigningAlgorithm signingAlgorithm = null;

        /**
         * The algorithm to be used for signing. These are the only supported signing algorithms for container images.
         * @param signingAlgorithm the value to set
         * @return this builder instance
         */
        public Builder signingAlgorithm(SigningAlgorithm signingAlgorithm) {
            this.signingAlgorithm = signingAlgorithm;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated
         * "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated
         * "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
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
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
         * call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
         * call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
         * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME
         * sort order is case sensitive.
         * <p>
         **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
         * optionally filter by availability domain if the scope of the resource type is within a
         * single availability domain. If you call one of these "List" operations without specifying
         * an availability domain, the resources are grouped by availability domain, then sorted.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
         * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME
         * sort order is case sensitive.
         * <p>
         **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
         * optionally filter by availability domain if the scope of the resource type is within a
         * single availability domain. If you call one of these "List" operations without specifying
         * an availability domain, the resources are grouped by availability domain, then sorted.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The DISPLAYNAME sort order
         * is case sensitive.
         *
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The DISPLAYNAME sort order
         * is case sensitive.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListContainerImageSignaturesRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            imageId(o.getImageId());
            repositoryId(o.getRepositoryId());
            repositoryName(o.getRepositoryName());
            imageDigest(o.getImageDigest());
            displayName(o.getDisplayName());
            kmsKeyId(o.getKmsKeyId());
            kmsKeyVersionId(o.getKmsKeyVersionId());
            signingAlgorithm(o.getSigningAlgorithm());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListContainerImageSignaturesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListContainerImageSignaturesRequest
         */
        public ListContainerImageSignaturesRequest build() {
            ListContainerImageSignaturesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListContainerImageSignaturesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListContainerImageSignaturesRequest
         */
        public ListContainerImageSignaturesRequest buildWithoutInvocationCallback() {
            ListContainerImageSignaturesRequest request = new ListContainerImageSignaturesRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.imageId = imageId;
            request.repositoryId = repositoryId;
            request.repositoryName = repositoryName;
            request.imageDigest = imageDigest;
            request.displayName = displayName;
            request.kmsKeyId = kmsKeyId;
            request.kmsKeyVersionId = kmsKeyVersionId;
            request.signingAlgorithm = signingAlgorithm;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new ListContainerImageSignaturesRequest(compartmentId, compartmentIdInSubtree, imageId, repositoryId, repositoryName, imageDigest, displayName, kmsKeyId, kmsKeyVersionId, signingAlgorithm, limit, page, opcRequestId, sortBy, sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .imageId(imageId)
                .repositoryId(repositoryId)
                .repositoryName(repositoryName)
                .imageDigest(imageDigest)
                .displayName(displayName)
                .kmsKeyId(kmsKeyId)
                .kmsKeyVersionId(kmsKeyVersionId)
                .signingAlgorithm(signingAlgorithm)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .sortBy(sortBy)
                .sortOrder(sortOrder);
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
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",imageId=").append(String.valueOf(this.imageId));
        sb.append(",repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(",repositoryName=").append(String.valueOf(this.repositoryName));
        sb.append(",imageDigest=").append(String.valueOf(this.imageDigest));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(",kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(",signingAlgorithm=").append(String.valueOf(this.signingAlgorithm));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListContainerImageSignaturesRequest)) {
            return false;
        }

        ListContainerImageSignaturesRequest other = (ListContainerImageSignaturesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.repositoryName, other.repositoryName)
                && java.util.Objects.equals(this.imageDigest, other.imageDigest)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.signingAlgorithm, other.signingAlgorithm)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
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
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryName == null ? 43 : this.repositoryName.hashCode());
        result = (result * PRIME) + (this.imageDigest == null ? 43 : this.imageDigest.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.signingAlgorithm == null ? 43 : this.signingAlgorithm.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
