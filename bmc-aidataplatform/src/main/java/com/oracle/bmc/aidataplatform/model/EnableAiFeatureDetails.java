/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidataplatform.model;

/**
 * The data to enable Ai Feature for AiDataPlatform. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EnableAiFeatureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EnableAiFeatureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    public EnableAiFeatureDetails(
            String vectorDbId, String vectorDbAdminCred, String vectorDbAdminSecretId) {
        super();
        this.vectorDbId = vectorDbId;
        this.vectorDbAdminCred = vectorDbAdminCred != null ? vectorDbAdminCred.toCharArray() : null;
        this.vectorDbAdminSecretId = vectorDbAdminSecretId;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    @java.beans.ConstructorProperties({"vectorDbId", "vectorDbAdminCred", "vectorDbAdminSecretId"})
    public EnableAiFeatureDetails(
            String vectorDbId, char[] vectorDbAdminCred, String vectorDbAdminSecretId) {
        super();
        this.vectorDbId = vectorDbId;
        this.vectorDbAdminCred = vectorDbAdminCred;
        this.vectorDbAdminSecretId = vectorDbAdminSecretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * vector db Lakehouse 26ai.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vectorDbId")
        private String vectorDbId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * vector db Lakehouse 26ai.
         *
         * @param vectorDbId the value to set
         * @return this builder
         */
        public Builder vectorDbId(String vectorDbId) {
            this.vectorDbId = vectorDbId;
            this.__explicitlySet__.add("vectorDbId");
            return this;
        }
        /** The Vector DB Lakehouse 26ai ADMIN user password. */
        @com.fasterxml.jackson.annotation.JsonProperty("vectorDbAdminCred")
        private char[] vectorDbAdminCred;

        /**
         * The Vector DB Lakehouse 26ai ADMIN user password.
         *
         * @param vectorDbAdminCred the value to set
         * @return this builder
         */
        public Builder vectorDbAdminCred(char[] vectorDbAdminCred) {
            this.vectorDbAdminCred = vectorDbAdminCred;
            this.__explicitlySet__.add("vectorDbAdminCred");
            return this;
        }

        public Builder vectorDbAdminCred(String vectorDbAdminCred) {
            this.vectorDbAdminCred =
                    vectorDbAdminCred != null ? vectorDbAdminCred.toCharArray() : null;
            this.__explicitlySet__.add("vectorDbAdminCred");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI Vault secret holding the vector db Lakehouse 26ai Admin user password.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vectorDbAdminSecretId")
        private String vectorDbAdminSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI Vault secret holding the vector db Lakehouse 26ai Admin user password.
         *
         * @param vectorDbAdminSecretId the value to set
         * @return this builder
         */
        public Builder vectorDbAdminSecretId(String vectorDbAdminSecretId) {
            this.vectorDbAdminSecretId = vectorDbAdminSecretId;
            this.__explicitlySet__.add("vectorDbAdminSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnableAiFeatureDetails build() {
            EnableAiFeatureDetails model =
                    new EnableAiFeatureDetails(
                            this.vectorDbId, this.vectorDbAdminCred, this.vectorDbAdminSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnableAiFeatureDetails model) {
            if (model.wasPropertyExplicitlySet("vectorDbId")) {
                this.vectorDbId(model.getVectorDbId());
            }
            if (model.wasPropertyExplicitlySet("vectorDbAdminCred")) {
                this.vectorDbAdminCred(model.getVectorDbAdminCred());
            }
            if (model.wasPropertyExplicitlySet("vectorDbAdminSecretId")) {
                this.vectorDbAdminSecretId(model.getVectorDbAdminSecretId());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * vector db Lakehouse 26ai.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vectorDbId")
    private final String vectorDbId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * vector db Lakehouse 26ai.
     *
     * @return the value
     */
    public String getVectorDbId() {
        return vectorDbId;
    }

    /** The Vector DB Lakehouse 26ai ADMIN user password. */
    @com.fasterxml.jackson.annotation.JsonProperty("vectorDbAdminCred")
    private final char[] vectorDbAdminCred;

    /**
     * The Vector DB Lakehouse 26ai ADMIN user password.
     *
     * @return the value
     * @deprecated Use getVectorDbAdminCred__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getVectorDbAdminCred() {
        return vectorDbAdminCred != null ? new String(vectorDbAdminCred) : null;
    }

    /**
     * The Vector DB Lakehouse 26ai ADMIN user password.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vectorDbAdminCred")
    public char[] getVectorDbAdminCred__AsCharArray() {
        return vectorDbAdminCred;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * Vault secret holding the vector db Lakehouse 26ai Admin user password.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vectorDbAdminSecretId")
    private final String vectorDbAdminSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * Vault secret holding the vector db Lakehouse 26ai Admin user password.
     *
     * @return the value
     */
    public String getVectorDbAdminSecretId() {
        return vectorDbAdminSecretId;
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
        sb.append("EnableAiFeatureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vectorDbId=").append(String.valueOf(this.vectorDbId));
        sb.append(", vectorDbAdminCred=").append("<redacted>");
        sb.append(", vectorDbAdminSecretId=").append(String.valueOf(this.vectorDbAdminSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableAiFeatureDetails)) {
            return false;
        }

        EnableAiFeatureDetails other = (EnableAiFeatureDetails) o;
        return java.util.Objects.equals(this.vectorDbId, other.vectorDbId)
                && java.util.Objects.equals(this.vectorDbAdminCred, other.vectorDbAdminCred)
                && java.util.Objects.equals(this.vectorDbAdminSecretId, other.vectorDbAdminSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vectorDbId == null ? 43 : this.vectorDbId.hashCode());
        result =
                (result * PRIME)
                        + (this.vectorDbAdminCred == null ? 43 : this.vectorDbAdminCred.hashCode());
        result =
                (result * PRIME)
                        + (this.vectorDbAdminSecretId == null
                                ? 43
                                : this.vectorDbAdminSecretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
