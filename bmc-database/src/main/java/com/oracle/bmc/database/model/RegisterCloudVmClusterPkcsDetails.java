/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of registering PKCS11 driver. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RegisterCloudVmClusterPkcsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RegisterCloudVmClusterPkcsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tdeKeyStoreType"})
    public RegisterCloudVmClusterPkcsDetails(TdeKeyStoreType tdeKeyStoreType) {
        super();
        this.tdeKeyStoreType = tdeKeyStoreType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** TDE keystore type */
        @com.fasterxml.jackson.annotation.JsonProperty("tdeKeyStoreType")
        private TdeKeyStoreType tdeKeyStoreType;

        /**
         * TDE keystore type
         *
         * @param tdeKeyStoreType the value to set
         * @return this builder
         */
        public Builder tdeKeyStoreType(TdeKeyStoreType tdeKeyStoreType) {
            this.tdeKeyStoreType = tdeKeyStoreType;
            this.__explicitlySet__.add("tdeKeyStoreType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RegisterCloudVmClusterPkcsDetails build() {
            RegisterCloudVmClusterPkcsDetails model =
                    new RegisterCloudVmClusterPkcsDetails(this.tdeKeyStoreType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegisterCloudVmClusterPkcsDetails model) {
            if (model.wasPropertyExplicitlySet("tdeKeyStoreType")) {
                this.tdeKeyStoreType(model.getTdeKeyStoreType());
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

    /** TDE keystore type */
    public enum TdeKeyStoreType implements com.oracle.bmc.http.internal.BmcEnum {
        Azure("AZURE"),
        Oci("OCI"),
        Gcp("GCP"),
        Aws("AWS"),
        ;

        private final String value;
        private static java.util.Map<String, TdeKeyStoreType> map;

        static {
            map = new java.util.HashMap<>();
            for (TdeKeyStoreType v : TdeKeyStoreType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TdeKeyStoreType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TdeKeyStoreType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TdeKeyStoreType: " + key);
        }
    };
    /** TDE keystore type */
    @com.fasterxml.jackson.annotation.JsonProperty("tdeKeyStoreType")
    private final TdeKeyStoreType tdeKeyStoreType;

    /**
     * TDE keystore type
     *
     * @return the value
     */
    public TdeKeyStoreType getTdeKeyStoreType() {
        return tdeKeyStoreType;
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
        sb.append("RegisterCloudVmClusterPkcsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("tdeKeyStoreType=").append(String.valueOf(this.tdeKeyStoreType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegisterCloudVmClusterPkcsDetails)) {
            return false;
        }

        RegisterCloudVmClusterPkcsDetails other = (RegisterCloudVmClusterPkcsDetails) o;
        return java.util.Objects.equals(this.tdeKeyStoreType, other.tdeKeyStoreType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.tdeKeyStoreType == null ? 43 : this.tdeKeyStoreType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
