/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * DVP details of Oracle RM stack.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OracleRMStack.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "dvpStackType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OracleRMStack extends DvpStackDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dvpVersion")
        private String dvpVersion;

        public Builder dvpVersion(String dvpVersion) {
            this.dvpVersion = dvpVersion;
            this.__explicitlySet__.add("dvpVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dvpStackId")
        private String dvpStackId;

        public Builder dvpStackId(String dvpStackId) {
            this.dvpStackId = dvpStackId;
            this.__explicitlySet__.add("dvpStackId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dvpStreamId")
        private String dvpStreamId;

        public Builder dvpStreamId(String dvpStreamId) {
            this.dvpStreamId = dvpStreamId;
            this.__explicitlySet__.add("dvpStreamId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleRMStack build() {
            OracleRMStack __instance__ = new OracleRMStack(dvpVersion, dvpStackId, dvpStreamId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleRMStack o) {
            Builder copiedBuilder =
                    dvpVersion(o.getDvpVersion())
                            .dvpStackId(o.getDvpStackId())
                            .dvpStreamId(o.getDvpStreamId());

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

    @Deprecated
    public OracleRMStack(String dvpVersion, String dvpStackId, String dvpStreamId) {
        super(dvpVersion);
        this.dvpStackId = dvpStackId;
        this.dvpStreamId = dvpStreamId;
    }

    /**
     * Stack [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of DVP RM stack.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dvpStackId")
    String dvpStackId;

    /**
     * Stream [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of DVP RM stack.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dvpStreamId")
    String dvpStreamId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
