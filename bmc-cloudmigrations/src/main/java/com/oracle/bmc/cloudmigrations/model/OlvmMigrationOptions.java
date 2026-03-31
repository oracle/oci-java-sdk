/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Reference to cluster-wide configuration of migration of a running virtual machine to another
 * host. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OlvmMigrationOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmMigrationOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "autoConverge",
        "bandwidth",
        "compressed",
        "customParallelMigrations",
        "encrypted",
        "parallelMigrationsPolicy"
    })
    public OlvmMigrationOptions(
            AutoConverge autoConverge,
            MigrationBandwidth bandwidth,
            Compressed compressed,
            Integer customParallelMigrations,
            Encrypted encrypted,
            ParallelMigrationsPolicy parallelMigrationsPolicy) {
        super();
        this.autoConverge = autoConverge;
        this.bandwidth = bandwidth;
        this.compressed = compressed;
        this.customParallelMigrations = customParallelMigrations;
        this.encrypted = encrypted;
        this.parallelMigrationsPolicy = parallelMigrationsPolicy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enum representing the boolean value that can be either set, or inherited from a higher
         * level. The inheritance order is virtual machine ??? cluster ??? engine-config.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoConverge")
        private AutoConverge autoConverge;

        /**
         * Enum representing the boolean value that can be either set, or inherited from a higher
         * level. The inheritance order is virtual machine ??? cluster ??? engine-config.
         *
         * @param autoConverge the value to set
         * @return this builder
         */
        public Builder autoConverge(AutoConverge autoConverge) {
            this.autoConverge = autoConverge;
            this.__explicitlySet__.add("autoConverge");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bandwidth")
        private MigrationBandwidth bandwidth;

        public Builder bandwidth(MigrationBandwidth bandwidth) {
            this.bandwidth = bandwidth;
            this.__explicitlySet__.add("bandwidth");
            return this;
        }
        /**
         * Enum representing the boolean value that can be either set, or inherited from a higher
         * level. The inheritance order is virtual machine ??? cluster ??? engine-config.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compressed")
        private Compressed compressed;

        /**
         * Enum representing the boolean value that can be either set, or inherited from a higher
         * level. The inheritance order is virtual machine ??? cluster ??? engine-config.
         *
         * @param compressed the value to set
         * @return this builder
         */
        public Builder compressed(Compressed compressed) {
            this.compressed = compressed;
            this.__explicitlySet__.add("compressed");
            return this;
        }
        /** Specifies how many parallel migration connections to use. */
        @com.fasterxml.jackson.annotation.JsonProperty("customParallelMigrations")
        private Integer customParallelMigrations;

        /**
         * Specifies how many parallel migration connections to use.
         *
         * @param customParallelMigrations the value to set
         * @return this builder
         */
        public Builder customParallelMigrations(Integer customParallelMigrations) {
            this.customParallelMigrations = customParallelMigrations;
            this.__explicitlySet__.add("customParallelMigrations");
            return this;
        }
        /**
         * Enum representing the boolean value that can be either set, or inherited from a higher
         * level. The inheritance order is virtual machine ??? cluster ??? engine-config.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("encrypted")
        private Encrypted encrypted;

        /**
         * Enum representing the boolean value that can be either set, or inherited from a higher
         * level. The inheritance order is virtual machine ??? cluster ??? engine-config.
         *
         * @param encrypted the value to set
         * @return this builder
         */
        public Builder encrypted(Encrypted encrypted) {
            this.encrypted = encrypted;
            this.__explicitlySet__.add("encrypted");
            return this;
        }
        /** Type representing parallel migration connections policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("parallelMigrationsPolicy")
        private ParallelMigrationsPolicy parallelMigrationsPolicy;

        /**
         * Type representing parallel migration connections policy.
         *
         * @param parallelMigrationsPolicy the value to set
         * @return this builder
         */
        public Builder parallelMigrationsPolicy(ParallelMigrationsPolicy parallelMigrationsPolicy) {
            this.parallelMigrationsPolicy = parallelMigrationsPolicy;
            this.__explicitlySet__.add("parallelMigrationsPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmMigrationOptions build() {
            OlvmMigrationOptions model =
                    new OlvmMigrationOptions(
                            this.autoConverge,
                            this.bandwidth,
                            this.compressed,
                            this.customParallelMigrations,
                            this.encrypted,
                            this.parallelMigrationsPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmMigrationOptions model) {
            if (model.wasPropertyExplicitlySet("autoConverge")) {
                this.autoConverge(model.getAutoConverge());
            }
            if (model.wasPropertyExplicitlySet("bandwidth")) {
                this.bandwidth(model.getBandwidth());
            }
            if (model.wasPropertyExplicitlySet("compressed")) {
                this.compressed(model.getCompressed());
            }
            if (model.wasPropertyExplicitlySet("customParallelMigrations")) {
                this.customParallelMigrations(model.getCustomParallelMigrations());
            }
            if (model.wasPropertyExplicitlySet("encrypted")) {
                this.encrypted(model.getEncrypted());
            }
            if (model.wasPropertyExplicitlySet("parallelMigrationsPolicy")) {
                this.parallelMigrationsPolicy(model.getParallelMigrationsPolicy());
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
     * Enum representing the boolean value that can be either set, or inherited from a higher level.
     * The inheritance order is virtual machine ??? cluster ??? engine-config.
     */
    public enum AutoConverge implements com.oracle.bmc.http.internal.BmcEnum {
        False("FALSE"),
        Inherit("INHERIT"),
        True("TRUE"),
        ;

        private final String value;
        private static java.util.Map<String, AutoConverge> map;

        static {
            map = new java.util.HashMap<>();
            for (AutoConverge v : AutoConverge.values()) {
                map.put(v.getValue(), v);
            }
        }

        AutoConverge(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutoConverge create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AutoConverge: " + key);
        }
    };
    /**
     * Enum representing the boolean value that can be either set, or inherited from a higher level.
     * The inheritance order is virtual machine ??? cluster ??? engine-config.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoConverge")
    private final AutoConverge autoConverge;

    /**
     * Enum representing the boolean value that can be either set, or inherited from a higher level.
     * The inheritance order is virtual machine ??? cluster ??? engine-config.
     *
     * @return the value
     */
    public AutoConverge getAutoConverge() {
        return autoConverge;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bandwidth")
    private final MigrationBandwidth bandwidth;

    public MigrationBandwidth getBandwidth() {
        return bandwidth;
    }

    /**
     * Enum representing the boolean value that can be either set, or inherited from a higher level.
     * The inheritance order is virtual machine ??? cluster ??? engine-config.
     */
    public enum Compressed implements com.oracle.bmc.http.internal.BmcEnum {
        False("FALSE"),
        Inherit("INHERIT"),
        True("TRUE"),
        ;

        private final String value;
        private static java.util.Map<String, Compressed> map;

        static {
            map = new java.util.HashMap<>();
            for (Compressed v : Compressed.values()) {
                map.put(v.getValue(), v);
            }
        }

        Compressed(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Compressed create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Compressed: " + key);
        }
    };
    /**
     * Enum representing the boolean value that can be either set, or inherited from a higher level.
     * The inheritance order is virtual machine ??? cluster ??? engine-config.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compressed")
    private final Compressed compressed;

    /**
     * Enum representing the boolean value that can be either set, or inherited from a higher level.
     * The inheritance order is virtual machine ??? cluster ??? engine-config.
     *
     * @return the value
     */
    public Compressed getCompressed() {
        return compressed;
    }

    /** Specifies how many parallel migration connections to use. */
    @com.fasterxml.jackson.annotation.JsonProperty("customParallelMigrations")
    private final Integer customParallelMigrations;

    /**
     * Specifies how many parallel migration connections to use.
     *
     * @return the value
     */
    public Integer getCustomParallelMigrations() {
        return customParallelMigrations;
    }

    /**
     * Enum representing the boolean value that can be either set, or inherited from a higher level.
     * The inheritance order is virtual machine ??? cluster ??? engine-config.
     */
    public enum Encrypted implements com.oracle.bmc.http.internal.BmcEnum {
        False("FALSE"),
        Inherit("INHERIT"),
        True("TRUE"),
        ;

        private final String value;
        private static java.util.Map<String, Encrypted> map;

        static {
            map = new java.util.HashMap<>();
            for (Encrypted v : Encrypted.values()) {
                map.put(v.getValue(), v);
            }
        }

        Encrypted(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Encrypted create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Encrypted: " + key);
        }
    };
    /**
     * Enum representing the boolean value that can be either set, or inherited from a higher level.
     * The inheritance order is virtual machine ??? cluster ??? engine-config.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encrypted")
    private final Encrypted encrypted;

    /**
     * Enum representing the boolean value that can be either set, or inherited from a higher level.
     * The inheritance order is virtual machine ??? cluster ??? engine-config.
     *
     * @return the value
     */
    public Encrypted getEncrypted() {
        return encrypted;
    }

    /** Type representing parallel migration connections policy. */
    public enum ParallelMigrationsPolicy implements com.oracle.bmc.http.internal.BmcEnum {
        Auto("AUTO"),
        AutoParallel("AUTO_PARALLEL"),
        Custom("CUSTOM"),
        Disabled("DISABLED"),
        Inherit("INHERIT"),
        ;

        private final String value;
        private static java.util.Map<String, ParallelMigrationsPolicy> map;

        static {
            map = new java.util.HashMap<>();
            for (ParallelMigrationsPolicy v : ParallelMigrationsPolicy.values()) {
                map.put(v.getValue(), v);
            }
        }

        ParallelMigrationsPolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ParallelMigrationsPolicy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ParallelMigrationsPolicy: " + key);
        }
    };
    /** Type representing parallel migration connections policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("parallelMigrationsPolicy")
    private final ParallelMigrationsPolicy parallelMigrationsPolicy;

    /**
     * Type representing parallel migration connections policy.
     *
     * @return the value
     */
    public ParallelMigrationsPolicy getParallelMigrationsPolicy() {
        return parallelMigrationsPolicy;
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
        sb.append("OlvmMigrationOptions(");
        sb.append("super=").append(super.toString());
        sb.append("autoConverge=").append(String.valueOf(this.autoConverge));
        sb.append(", bandwidth=").append(String.valueOf(this.bandwidth));
        sb.append(", compressed=").append(String.valueOf(this.compressed));
        sb.append(", customParallelMigrations=")
                .append(String.valueOf(this.customParallelMigrations));
        sb.append(", encrypted=").append(String.valueOf(this.encrypted));
        sb.append(", parallelMigrationsPolicy=")
                .append(String.valueOf(this.parallelMigrationsPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmMigrationOptions)) {
            return false;
        }

        OlvmMigrationOptions other = (OlvmMigrationOptions) o;
        return java.util.Objects.equals(this.autoConverge, other.autoConverge)
                && java.util.Objects.equals(this.bandwidth, other.bandwidth)
                && java.util.Objects.equals(this.compressed, other.compressed)
                && java.util.Objects.equals(
                        this.customParallelMigrations, other.customParallelMigrations)
                && java.util.Objects.equals(this.encrypted, other.encrypted)
                && java.util.Objects.equals(
                        this.parallelMigrationsPolicy, other.parallelMigrationsPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.autoConverge == null ? 43 : this.autoConverge.hashCode());
        result = (result * PRIME) + (this.bandwidth == null ? 43 : this.bandwidth.hashCode());
        result = (result * PRIME) + (this.compressed == null ? 43 : this.compressed.hashCode());
        result =
                (result * PRIME)
                        + (this.customParallelMigrations == null
                                ? 43
                                : this.customParallelMigrations.hashCode());
        result = (result * PRIME) + (this.encrypted == null ? 43 : this.encrypted.hashCode());
        result =
                (result * PRIME)
                        + (this.parallelMigrationsPolicy == null
                                ? 43
                                : this.parallelMigrationsPolicy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
