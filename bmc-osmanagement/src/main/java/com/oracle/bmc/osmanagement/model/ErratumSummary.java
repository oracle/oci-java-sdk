/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Important changes for software. This can include security advisories, bug fixes, or enhancements.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ErratumSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ErratumSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("synopsis")
        private String synopsis;

        public Builder synopsis(String synopsis) {
            this.synopsis = synopsis;
            this.__explicitlySet__.add("synopsis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("issued")
        private String issued;

        public Builder issued(String issued) {
            this.issued = issued;
            this.__explicitlySet__.add("issued");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updated")
        private String updated;

        public Builder updated(String updated) {
            this.updated = updated;
            this.__explicitlySet__.add("updated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
        private UpdateTypes advisoryType;

        public Builder advisoryType(UpdateTypes advisoryType) {
            this.advisoryType = advisoryType;
            this.__explicitlySet__.add("advisoryType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
        private java.util.List<String> relatedCves;

        public Builder relatedCves(java.util.List<String> relatedCves) {
            this.relatedCves = relatedCves;
            this.__explicitlySet__.add("relatedCves");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ErratumSummary build() {
            ErratumSummary __instance__ =
                    new ErratumSummary(
                            name,
                            id,
                            compartmentId,
                            synopsis,
                            issued,
                            updated,
                            advisoryType,
                            relatedCves);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ErratumSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .synopsis(o.getSynopsis())
                            .issued(o.getIssued())
                            .updated(o.getUpdated())
                            .advisoryType(o.getAdvisoryType())
                            .relatedCves(o.getRelatedCves());

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
     * Advisory name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * OCID for the Erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * OCID for the Compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Summary description of the erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("synopsis")
    String synopsis;

    /**
     * date the erratum was issued
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    String issued;

    /**
     * most recent date the erratum was updated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updated")
    String updated;

    /**
     * Type of the erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
    UpdateTypes advisoryType;

    /**
     * list of CVEs applicable to this erratum
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
    java.util.List<String> relatedCves;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
