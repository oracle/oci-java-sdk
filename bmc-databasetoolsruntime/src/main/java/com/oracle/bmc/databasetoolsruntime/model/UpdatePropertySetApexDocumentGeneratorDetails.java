/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Contains the update details of an APEX document generator property set <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdatePropertySetApexDocumentGeneratorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "key")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdatePropertySetApexDocumentGeneratorDetails extends UpdatePropertySetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The print server type */
        @com.fasterxml.jackson.annotation.JsonProperty("printServerType")
        private PropertySetApexDocumentGenerator.PrintServerType printServerType;

        /**
         * The print server type
         *
         * @param printServerType the value to set
         * @return this builder
         */
        public Builder printServerType(
                PropertySetApexDocumentGenerator.PrintServerType printServerType) {
            this.printServerType = printServerType;
            this.__explicitlySet__.add("printServerType");
            return this;
        }
        /**
         * The name of the credential used by APEX to manage Object Storage Buckets and Objects as
         * well as invoke the Document Generator function.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
        private String credentialKey;

        /**
         * The name of the credential used by APEX to manage Object Storage Buckets and Objects as
         * well as invoke the Document Generator function.
         *
         * @param credentialKey the value to set
         * @return this builder
         */
        public Builder credentialKey(String credentialKey) {
            this.credentialKey = credentialKey;
            this.__explicitlySet__.add("credentialKey");
            return this;
        }
        /**
         * The status of the Autonomous Database Serverless Resource Principal
         * (OCI$RESOURCE_PRINCIPAL)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseResourcePrincipalStatus")
        private PropertySetApexDocumentGenerator.AutonomousDatabaseResourcePrincipalStatus
                autonomousDatabaseResourcePrincipalStatus;

        /**
         * The status of the Autonomous Database Serverless Resource Principal
         * (OCI$RESOURCE_PRINCIPAL)
         *
         * @param autonomousDatabaseResourcePrincipalStatus the value to set
         * @return this builder
         */
        public Builder autonomousDatabaseResourcePrincipalStatus(
                PropertySetApexDocumentGenerator.AutonomousDatabaseResourcePrincipalStatus
                        autonomousDatabaseResourcePrincipalStatus) {
            this.autonomousDatabaseResourcePrincipalStatus =
                    autonomousDatabaseResourcePrincipalStatus;
            this.__explicitlySet__.add("autonomousDatabaseResourcePrincipalStatus");
            return this;
        }
        /** The Object Storage Namespace containing the Object Storage Buckets managed by APEX */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
        private String objectStorageNamespace;

        /**
         * The Object Storage Namespace containing the Object Storage Buckets managed by APEX
         *
         * @param objectStorageNamespace the value to set
         * @return this builder
         */
        public Builder objectStorageNamespace(String objectStorageNamespace) {
            this.objectStorageNamespace = objectStorageNamespace;
            this.__explicitlySet__.add("objectStorageNamespace");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the Object Storage Buckets managed by APEX
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageBucketCompartmentId")
        private String objectStorageBucketCompartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the Object Storage Buckets managed by APEX
         *
         * @param objectStorageBucketCompartmentId the value to set
         * @return this builder
         */
        public Builder objectStorageBucketCompartmentId(String objectStorageBucketCompartmentId) {
            this.objectStorageBucketCompartmentId = objectStorageBucketCompartmentId;
            this.__explicitlySet__.add("objectStorageBucketCompartmentId");
            return this;
        }
        /** Object Storage Endpoint */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageEndpoint")
        private String objectStorageEndpoint;

        /**
         * Object Storage Endpoint
         *
         * @param objectStorageEndpoint the value to set
         * @return this builder
         */
        public Builder objectStorageEndpoint(String objectStorageEndpoint) {
            this.objectStorageEndpoint = objectStorageEndpoint;
            this.__explicitlySet__.add("objectStorageEndpoint");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Document Generator function
         */
        @com.fasterxml.jackson.annotation.JsonProperty("functionId")
        private String functionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Document Generator function
         *
         * @param functionId the value to set
         * @return this builder
         */
        public Builder functionId(String functionId) {
            this.functionId = functionId;
            this.__explicitlySet__.add("functionId");
            return this;
        }
        /** The base endpoint URL to use to invoke the Document Generator function */
        @com.fasterxml.jackson.annotation.JsonProperty("invokeEndpoint")
        private String invokeEndpoint;

        /**
         * The base endpoint URL to use to invoke the Document Generator function
         *
         * @param invokeEndpoint the value to set
         * @return this builder
         */
        public Builder invokeEndpoint(String invokeEndpoint) {
            this.invokeEndpoint = invokeEndpoint;
            this.__explicitlySet__.add("invokeEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePropertySetApexDocumentGeneratorDetails build() {
            UpdatePropertySetApexDocumentGeneratorDetails model =
                    new UpdatePropertySetApexDocumentGeneratorDetails(
                            this.printServerType,
                            this.credentialKey,
                            this.autonomousDatabaseResourcePrincipalStatus,
                            this.objectStorageNamespace,
                            this.objectStorageBucketCompartmentId,
                            this.objectStorageEndpoint,
                            this.functionId,
                            this.invokeEndpoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePropertySetApexDocumentGeneratorDetails model) {
            if (model.wasPropertyExplicitlySet("printServerType")) {
                this.printServerType(model.getPrintServerType());
            }
            if (model.wasPropertyExplicitlySet("credentialKey")) {
                this.credentialKey(model.getCredentialKey());
            }
            if (model.wasPropertyExplicitlySet("autonomousDatabaseResourcePrincipalStatus")) {
                this.autonomousDatabaseResourcePrincipalStatus(
                        model.getAutonomousDatabaseResourcePrincipalStatus());
            }
            if (model.wasPropertyExplicitlySet("objectStorageNamespace")) {
                this.objectStorageNamespace(model.getObjectStorageNamespace());
            }
            if (model.wasPropertyExplicitlySet("objectStorageBucketCompartmentId")) {
                this.objectStorageBucketCompartmentId(model.getObjectStorageBucketCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("objectStorageEndpoint")) {
                this.objectStorageEndpoint(model.getObjectStorageEndpoint());
            }
            if (model.wasPropertyExplicitlySet("functionId")) {
                this.functionId(model.getFunctionId());
            }
            if (model.wasPropertyExplicitlySet("invokeEndpoint")) {
                this.invokeEndpoint(model.getInvokeEndpoint());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public UpdatePropertySetApexDocumentGeneratorDetails(
            PropertySetApexDocumentGenerator.PrintServerType printServerType,
            String credentialKey,
            PropertySetApexDocumentGenerator.AutonomousDatabaseResourcePrincipalStatus
                    autonomousDatabaseResourcePrincipalStatus,
            String objectStorageNamespace,
            String objectStorageBucketCompartmentId,
            String objectStorageEndpoint,
            String functionId,
            String invokeEndpoint) {
        super();
        this.printServerType = printServerType;
        this.credentialKey = credentialKey;
        this.autonomousDatabaseResourcePrincipalStatus = autonomousDatabaseResourcePrincipalStatus;
        this.objectStorageNamespace = objectStorageNamespace;
        this.objectStorageBucketCompartmentId = objectStorageBucketCompartmentId;
        this.objectStorageEndpoint = objectStorageEndpoint;
        this.functionId = functionId;
        this.invokeEndpoint = invokeEndpoint;
    }

    /** The print server type */
    @com.fasterxml.jackson.annotation.JsonProperty("printServerType")
    private final PropertySetApexDocumentGenerator.PrintServerType printServerType;

    /**
     * The print server type
     *
     * @return the value
     */
    public PropertySetApexDocumentGenerator.PrintServerType getPrintServerType() {
        return printServerType;
    }

    /**
     * The name of the credential used by APEX to manage Object Storage Buckets and Objects as well
     * as invoke the Document Generator function.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
    private final String credentialKey;

    /**
     * The name of the credential used by APEX to manage Object Storage Buckets and Objects as well
     * as invoke the Document Generator function.
     *
     * @return the value
     */
    public String getCredentialKey() {
        return credentialKey;
    }

    /**
     * The status of the Autonomous Database Serverless Resource Principal (OCI$RESOURCE_PRINCIPAL)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseResourcePrincipalStatus")
    private final PropertySetApexDocumentGenerator.AutonomousDatabaseResourcePrincipalStatus
            autonomousDatabaseResourcePrincipalStatus;

    /**
     * The status of the Autonomous Database Serverless Resource Principal (OCI$RESOURCE_PRINCIPAL)
     *
     * @return the value
     */
    public PropertySetApexDocumentGenerator.AutonomousDatabaseResourcePrincipalStatus
            getAutonomousDatabaseResourcePrincipalStatus() {
        return autonomousDatabaseResourcePrincipalStatus;
    }

    /** The Object Storage Namespace containing the Object Storage Buckets managed by APEX */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
    private final String objectStorageNamespace;

    /**
     * The Object Storage Namespace containing the Object Storage Buckets managed by APEX
     *
     * @return the value
     */
    public String getObjectStorageNamespace() {
        return objectStorageNamespace;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the Object Storage Buckets managed by APEX
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageBucketCompartmentId")
    private final String objectStorageBucketCompartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the Object Storage Buckets managed by APEX
     *
     * @return the value
     */
    public String getObjectStorageBucketCompartmentId() {
        return objectStorageBucketCompartmentId;
    }

    /** Object Storage Endpoint */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageEndpoint")
    private final String objectStorageEndpoint;

    /**
     * Object Storage Endpoint
     *
     * @return the value
     */
    public String getObjectStorageEndpoint() {
        return objectStorageEndpoint;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Document Generator function
     */
    @com.fasterxml.jackson.annotation.JsonProperty("functionId")
    private final String functionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Document Generator function
     *
     * @return the value
     */
    public String getFunctionId() {
        return functionId;
    }

    /** The base endpoint URL to use to invoke the Document Generator function */
    @com.fasterxml.jackson.annotation.JsonProperty("invokeEndpoint")
    private final String invokeEndpoint;

    /**
     * The base endpoint URL to use to invoke the Document Generator function
     *
     * @return the value
     */
    public String getInvokeEndpoint() {
        return invokeEndpoint;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdatePropertySetApexDocumentGeneratorDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", printServerType=").append(String.valueOf(this.printServerType));
        sb.append(", credentialKey=").append(String.valueOf(this.credentialKey));
        sb.append(", autonomousDatabaseResourcePrincipalStatus=")
                .append(String.valueOf(this.autonomousDatabaseResourcePrincipalStatus));
        sb.append(", objectStorageNamespace=").append(String.valueOf(this.objectStorageNamespace));
        sb.append(", objectStorageBucketCompartmentId=")
                .append(String.valueOf(this.objectStorageBucketCompartmentId));
        sb.append(", objectStorageEndpoint=").append(String.valueOf(this.objectStorageEndpoint));
        sb.append(", functionId=").append(String.valueOf(this.functionId));
        sb.append(", invokeEndpoint=").append(String.valueOf(this.invokeEndpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePropertySetApexDocumentGeneratorDetails)) {
            return false;
        }

        UpdatePropertySetApexDocumentGeneratorDetails other =
                (UpdatePropertySetApexDocumentGeneratorDetails) o;
        return java.util.Objects.equals(this.printServerType, other.printServerType)
                && java.util.Objects.equals(this.credentialKey, other.credentialKey)
                && java.util.Objects.equals(
                        this.autonomousDatabaseResourcePrincipalStatus,
                        other.autonomousDatabaseResourcePrincipalStatus)
                && java.util.Objects.equals(
                        this.objectStorageNamespace, other.objectStorageNamespace)
                && java.util.Objects.equals(
                        this.objectStorageBucketCompartmentId,
                        other.objectStorageBucketCompartmentId)
                && java.util.Objects.equals(this.objectStorageEndpoint, other.objectStorageEndpoint)
                && java.util.Objects.equals(this.functionId, other.functionId)
                && java.util.Objects.equals(this.invokeEndpoint, other.invokeEndpoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.printServerType == null ? 43 : this.printServerType.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialKey == null ? 43 : this.credentialKey.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDatabaseResourcePrincipalStatus == null
                                ? 43
                                : this.autonomousDatabaseResourcePrincipalStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageNamespace == null
                                ? 43
                                : this.objectStorageNamespace.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageBucketCompartmentId == null
                                ? 43
                                : this.objectStorageBucketCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageEndpoint == null
                                ? 43
                                : this.objectStorageEndpoint.hashCode());
        result = (result * PRIME) + (this.functionId == null ? 43 : this.functionId.hashCode());
        result =
                (result * PRIME)
                        + (this.invokeEndpoint == null ? 43 : this.invokeEndpoint.hashCode());
        return result;
    }
}
