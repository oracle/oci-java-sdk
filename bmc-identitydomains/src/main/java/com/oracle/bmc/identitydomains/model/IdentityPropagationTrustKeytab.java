/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * The keytab stored in the tenancy's Vault. This is required if the identity propagation type is
 * 'SPNEGO'.
 *
 * <p>*SCIM++ Properties:** - idcsCompositeKey: [secretOcid] - idcsSearchable: false - multiValued:
 * false - mutability: readWrite - required: false - returned: default - type: complex - uniqueness:
 * none <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IdentityPropagationTrustKeytab.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IdentityPropagationTrustKeytab
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"secretOcid", "secretVersion"})
    public IdentityPropagationTrustKeytab(String secretOcid, Integer secretVersion) {
        super();
        this.secretOcid = secretOcid;
        this.secretVersion = secretVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the secret. The secret content corresponding to the OCID is expected to be in
         * Base64 encoded content type.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretOcid")
        private String secretOcid;

        /**
         * The OCID of the secret. The secret content corresponding to the OCID is expected to be in
         * Base64 encoded content type.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param secretOcid the value to set
         * @return this builder
         */
        public Builder secretOcid(String secretOcid) {
            this.secretOcid = secretOcid;
            this.__explicitlySet__.add("secretOcid");
            return this;
        }
        /**
         * The version of the secret. When the version is not specified, then the latest secret
         * version is used during runtime.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretVersion")
        private Integer secretVersion;

        /**
         * The version of the secret. When the version is not specified, then the latest secret
         * version is used during runtime.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
         * none
         *
         * @param secretVersion the value to set
         * @return this builder
         */
        public Builder secretVersion(Integer secretVersion) {
            this.secretVersion = secretVersion;
            this.__explicitlySet__.add("secretVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentityPropagationTrustKeytab build() {
            IdentityPropagationTrustKeytab model =
                    new IdentityPropagationTrustKeytab(this.secretOcid, this.secretVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityPropagationTrustKeytab model) {
            if (model.wasPropertyExplicitlySet("secretOcid")) {
                this.secretOcid(model.getSecretOcid());
            }
            if (model.wasPropertyExplicitlySet("secretVersion")) {
                this.secretVersion(model.getSecretVersion());
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
     * The OCID of the secret. The secret content corresponding to the OCID is expected to be in
     * Base64 encoded content type.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretOcid")
    private final String secretOcid;

    /**
     * The OCID of the secret. The secret content corresponding to the OCID is expected to be in
     * Base64 encoded content type.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getSecretOcid() {
        return secretOcid;
    }

    /**
     * The version of the secret. When the version is not specified, then the latest secret version
     * is used during runtime.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretVersion")
    private final Integer secretVersion;

    /**
     * The version of the secret. When the version is not specified, then the latest secret version
     * is used during runtime.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     *
     * @return the value
     */
    public Integer getSecretVersion() {
        return secretVersion;
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
        sb.append("IdentityPropagationTrustKeytab(");
        sb.append("super=").append(super.toString());
        sb.append("secretOcid=").append(String.valueOf(this.secretOcid));
        sb.append(", secretVersion=").append(String.valueOf(this.secretVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityPropagationTrustKeytab)) {
            return false;
        }

        IdentityPropagationTrustKeytab other = (IdentityPropagationTrustKeytab) o;
        return java.util.Objects.equals(this.secretOcid, other.secretOcid)
                && java.util.Objects.equals(this.secretVersion, other.secretVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.secretOcid == null ? 43 : this.secretOcid.hashCode());
        result =
                (result * PRIME)
                        + (this.secretVersion == null ? 43 : this.secretVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
