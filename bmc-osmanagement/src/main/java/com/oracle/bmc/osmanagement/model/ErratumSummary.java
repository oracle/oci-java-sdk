/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Important changes for software. This can include security | advisories, bug fixes, or enhancements.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ErratumSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ErratumSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "id",
        "compartmentId",
        "synopsis",
        "issued",
        "updated",
        "advisoryType",
        "relatedCves"
    })
    public ErratumSummary(
            String name,
            String id,
            String compartmentId,
            String synopsis,
            String issued,
            String updated,
            UpdateTypes advisoryType,
            java.util.List<String> relatedCves) {
        super();
        this.name = name;
        this.id = id;
        this.compartmentId = compartmentId;
        this.synopsis = synopsis;
        this.issued = issued;
        this.updated = updated;
        this.advisoryType = advisoryType;
        this.relatedCves = relatedCves;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Advisory name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * OCID for the Erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * OCID for the Compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Summary description of the erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("synopsis")
    private final String synopsis;

    public String getSynopsis() {
        return synopsis;
    }

    /**
     * date the erratum was issued
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    private final String issued;

    public String getIssued() {
        return issued;
    }

    /**
     * most recent date the erratum was updated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updated")
    private final String updated;

    public String getUpdated() {
        return updated;
    }

    /**
     * Type of the erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
    private final UpdateTypes advisoryType;

    public UpdateTypes getAdvisoryType() {
        return advisoryType;
    }

    /**
     * list of CVEs applicable to this erratum
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
    private final java.util.List<String> relatedCves;

    public java.util.List<String> getRelatedCves() {
        return relatedCves;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ErratumSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", synopsis=").append(String.valueOf(this.synopsis));
        sb.append(", issued=").append(String.valueOf(this.issued));
        sb.append(", updated=").append(String.valueOf(this.updated));
        sb.append(", advisoryType=").append(String.valueOf(this.advisoryType));
        sb.append(", relatedCves=").append(String.valueOf(this.relatedCves));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ErratumSummary)) {
            return false;
        }

        ErratumSummary other = (ErratumSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.synopsis, other.synopsis)
                && java.util.Objects.equals(this.issued, other.issued)
                && java.util.Objects.equals(this.updated, other.updated)
                && java.util.Objects.equals(this.advisoryType, other.advisoryType)
                && java.util.Objects.equals(this.relatedCves, other.relatedCves)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.synopsis == null ? 43 : this.synopsis.hashCode());
        result = (result * PRIME) + (this.issued == null ? 43 : this.issued.hashCode());
        result = (result * PRIME) + (this.updated == null ? 43 : this.updated.hashCode());
        result = (result * PRIME) + (this.advisoryType == null ? 43 : this.advisoryType.hashCode());
        result = (result * PRIME) + (this.relatedCves == null ? 43 : this.relatedCves.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
