/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Optional settings for GoldenGate Microservices processes
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateGoldenGateSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateGoldenGateSettings
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"extract", "replicat", "acceptableLag"})
    public CreateGoldenGateSettings(
            CreateExtract extract, CreateReplicat replicat, Integer acceptableLag) {
        super();
        this.extract = extract;
        this.replicat = replicat;
        this.acceptableLag = acceptableLag;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("extract")
        private CreateExtract extract;

        public Builder extract(CreateExtract extract) {
            this.extract = extract;
            this.__explicitlySet__.add("extract");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicat")
        private CreateReplicat replicat;

        public Builder replicat(CreateReplicat replicat) {
            this.replicat = replicat;
            this.__explicitlySet__.add("replicat");
            return this;
        }
        /**
         * ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the specified value in seconds.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("acceptableLag")
        private Integer acceptableLag;

        /**
         * ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the specified value in seconds.
         *
         * @param acceptableLag the value to set
         * @return this builder
         **/
        public Builder acceptableLag(Integer acceptableLag) {
            this.acceptableLag = acceptableLag;
            this.__explicitlySet__.add("acceptableLag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateGoldenGateSettings build() {
            CreateGoldenGateSettings model =
                    new CreateGoldenGateSettings(this.extract, this.replicat, this.acceptableLag);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGoldenGateSettings model) {
            if (model.wasPropertyExplicitlySet("extract")) {
                this.extract(model.getExtract());
            }
            if (model.wasPropertyExplicitlySet("replicat")) {
                this.replicat(model.getReplicat());
            }
            if (model.wasPropertyExplicitlySet("acceptableLag")) {
                this.acceptableLag(model.getAcceptableLag());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("extract")
    private final CreateExtract extract;

    public CreateExtract getExtract() {
        return extract;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicat")
    private final CreateReplicat replicat;

    public CreateReplicat getReplicat() {
        return replicat;
    }

    /**
     * ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the specified value in seconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("acceptableLag")
    private final Integer acceptableLag;

    /**
     * ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the specified value in seconds.
     *
     * @return the value
     **/
    public Integer getAcceptableLag() {
        return acceptableLag;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateGoldenGateSettings(");
        sb.append("super=").append(super.toString());
        sb.append("extract=").append(String.valueOf(this.extract));
        sb.append(", replicat=").append(String.valueOf(this.replicat));
        sb.append(", acceptableLag=").append(String.valueOf(this.acceptableLag));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateGoldenGateSettings)) {
            return false;
        }

        CreateGoldenGateSettings other = (CreateGoldenGateSettings) o;
        return java.util.Objects.equals(this.extract, other.extract)
                && java.util.Objects.equals(this.replicat, other.replicat)
                && java.util.Objects.equals(this.acceptableLag, other.acceptableLag)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.extract == null ? 43 : this.extract.hashCode());
        result = (result * PRIME) + (this.replicat == null ? 43 : this.replicat.hashCode());
        result =
                (result * PRIME)
                        + (this.acceptableLag == null ? 43 : this.acceptableLag.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
