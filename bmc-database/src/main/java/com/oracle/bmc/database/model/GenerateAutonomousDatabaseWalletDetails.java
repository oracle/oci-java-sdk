/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to create and download an Oracle Autonomous Database wallet.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GenerateAutonomousDatabaseWalletDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class GenerateAutonomousDatabaseWalletDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("generateType")
        private GenerateType generateType;

        public Builder generateType(GenerateType generateType) {
            this.generateType = generateType;
            this.__explicitlySet__.add("generateType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateAutonomousDatabaseWalletDetails build() {
            GenerateAutonomousDatabaseWalletDetails __instance__ =
                    new GenerateAutonomousDatabaseWalletDetails(generateType, password);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateAutonomousDatabaseWalletDetails o) {
            Builder copiedBuilder = generateType(o.getGenerateType()).password(o.getPassword());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The type of wallet to generate.
     * <p>
     **Shared Exadata infrastructure usage:**
     * * {@code SINGLE} - used to generate a wallet for a single database
     * * {@code ALL} - used to generate wallet for all databases in the region
     * <p>
     **Dedicated Exadata infrastructure usage:** Value must be {@code NULL} if attribute is used.
     *
     **/
    public enum GenerateType {
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
     * <p>
     **Shared Exadata infrastructure usage:**
     * * {@code SINGLE} - used to generate a wallet for a single database
     * * {@code ALL} - used to generate wallet for all databases in the region
     * <p>
     **Dedicated Exadata infrastructure usage:** Value must be {@code NULL} if attribute is used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("generateType")
    GenerateType generateType;

    /**
     * The password to encrypt the keys inside the wallet. The password must be at least 8 characters long and must include at least 1 letter and either 1 numeric character or 1 special character.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    String password;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
