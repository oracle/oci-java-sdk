/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to create and download an Oracle Autonomous Database wallet. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GenerateAutonomousDatabaseWalletDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class GenerateAutonomousDatabaseWalletDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"generateType", "password"})
    public GenerateAutonomousDatabaseWalletDetails(GenerateType generateType, String password) {
        super();
        this.generateType = generateType;
        this.password = password;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of wallet to generate.
         *
         * <p>*Shared Exadata infrastructure usage:** * {@code SINGLE} - used to generate a wallet
         * for a single database * {@code ALL} - used to generate wallet for all databases in the
         * region
         *
         * <p>*Dedicated Exadata infrastructure usage:** Value must be {@code NULL} if attribute is
         * used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("generateType")
        private GenerateType generateType;

        /**
         * The type of wallet to generate.
         *
         * <p>*Shared Exadata infrastructure usage:** * {@code SINGLE} - used to generate a wallet
         * for a single database * {@code ALL} - used to generate wallet for all databases in the
         * region
         *
         * <p>*Dedicated Exadata infrastructure usage:** Value must be {@code NULL} if attribute is
         * used.
         *
         * @param generateType the value to set
         * @return this builder
         */
        public Builder generateType(GenerateType generateType) {
            this.generateType = generateType;
            this.__explicitlySet__.add("generateType");
            return this;
        }
        /**
         * The password to encrypt the keys inside the wallet. The password must be at least 8
         * characters long and must include at least 1 letter and either 1 numeric character or 1
         * special character.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password to encrypt the keys inside the wallet. The password must be at least 8
         * characters long and must include at least 1 letter and either 1 numeric character or 1
         * special character.
         *
         * @param password the value to set
         * @return this builder
         */
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateAutonomousDatabaseWalletDetails build() {
            GenerateAutonomousDatabaseWalletDetails model =
                    new GenerateAutonomousDatabaseWalletDetails(this.generateType, this.password);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateAutonomousDatabaseWalletDetails model) {
            if (model.wasPropertyExplicitlySet("generateType")) {
                this.generateType(model.getGenerateType());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
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
     * The type of wallet to generate.
     *
     * <p>*Shared Exadata infrastructure usage:** * {@code SINGLE} - used to generate a wallet for a
     * single database * {@code ALL} - used to generate wallet for all databases in the region
     *
     * <p>*Dedicated Exadata infrastructure usage:** Value must be {@code NULL} if attribute is
     * used.
     */
    public enum GenerateType implements com.oracle.bmc.http.internal.BmcEnum {
        All("ALL"),
        Single("SINGLE"),
        ;

        private final String value;
        private static java.util.Map<String, GenerateType> map;

        static {
            map = new java.util.HashMap<>();
            for (GenerateType v : GenerateType.values()) {
                map.put(v.getValue(), v);
            }
        }

        GenerateType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GenerateType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid GenerateType: " + key);
        }
    };
    /**
     * The type of wallet to generate.
     *
     * <p>*Shared Exadata infrastructure usage:** * {@code SINGLE} - used to generate a wallet for a
     * single database * {@code ALL} - used to generate wallet for all databases in the region
     *
     * <p>*Dedicated Exadata infrastructure usage:** Value must be {@code NULL} if attribute is
     * used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("generateType")
    private final GenerateType generateType;

    /**
     * The type of wallet to generate.
     *
     * <p>*Shared Exadata infrastructure usage:** * {@code SINGLE} - used to generate a wallet for a
     * single database * {@code ALL} - used to generate wallet for all databases in the region
     *
     * <p>*Dedicated Exadata infrastructure usage:** Value must be {@code NULL} if attribute is
     * used.
     *
     * @return the value
     */
    public GenerateType getGenerateType() {
        return generateType;
    }

    /**
     * The password to encrypt the keys inside the wallet. The password must be at least 8
     * characters long and must include at least 1 letter and either 1 numeric character or 1
     * special character.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password to encrypt the keys inside the wallet. The password must be at least 8
     * characters long and must include at least 1 letter and either 1 numeric character or 1
     * special character.
     *
     * @return the value
     */
    public String getPassword() {
        return password;
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
        sb.append("GenerateAutonomousDatabaseWalletDetails(");
        sb.append("super=").append(super.toString());
        sb.append("generateType=").append(String.valueOf(this.generateType));
        sb.append(", password=").append(String.valueOf(this.password));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateAutonomousDatabaseWalletDetails)) {
            return false;
        }

        GenerateAutonomousDatabaseWalletDetails other = (GenerateAutonomousDatabaseWalletDetails) o;
        return java.util.Objects.equals(this.generateType, other.generateType)
                && java.util.Objects.equals(this.password, other.password)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.generateType == null ? 43 : this.generateType.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
