/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Important changes for software. This can include security | advisories, bug fixes, or
 * enhancements. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ErratumSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ErratumSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Advisory name */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Advisory name
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** OCID for the Erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID for the Erratum.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** OCID for the Compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID for the Compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Summary description of the erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("synopsis")
        private String synopsis;

        /**
         * Summary description of the erratum.
         *
         * @param synopsis the value to set
         * @return this builder
         */
        public Builder synopsis(String synopsis) {
            this.synopsis = synopsis;
            this.__explicitlySet__.add("synopsis");
            return this;
        }
        /** date the erratum was issued */
        @com.fasterxml.jackson.annotation.JsonProperty("issued")
        private String issued;

        /**
         * date the erratum was issued
         *
         * @param issued the value to set
         * @return this builder
         */
        public Builder issued(String issued) {
            this.issued = issued;
            this.__explicitlySet__.add("issued");
            return this;
        }
        /** most recent date the erratum was updated */
        @com.fasterxml.jackson.annotation.JsonProperty("updated")
        private String updated;

        /**
         * most recent date the erratum was updated
         *
         * @param updated the value to set
         * @return this builder
         */
        public Builder updated(String updated) {
            this.updated = updated;
            this.__explicitlySet__.add("updated");
            return this;
        }
        /** Type of the erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
        private UpdateTypes advisoryType;

        /**
         * Type of the erratum.
         *
         * @param advisoryType the value to set
         * @return this builder
         */
        public Builder advisoryType(UpdateTypes advisoryType) {
            this.advisoryType = advisoryType;
            this.__explicitlySet__.add("advisoryType");
            return this;
        }
        /** list of CVEs applicable to this erratum */
        @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
        private java.util.List<String> relatedCves;

        /**
         * list of CVEs applicable to this erratum
         *
         * @param relatedCves the value to set
         * @return this builder
         */
        public Builder relatedCves(java.util.List<String> relatedCves) {
            this.relatedCves = relatedCves;
            this.__explicitlySet__.add("relatedCves");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ErratumSummary build() {
            ErratumSummary model =
                    new ErratumSummary(
                            this.name,
                            this.id,
                            this.compartmentId,
                            this.synopsis,
                            this.issued,
                            this.updated,
                            this.advisoryType,
                            this.relatedCves);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ErratumSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("synopsis")) {
                this.synopsis(model.getSynopsis());
            }
            if (model.wasPropertyExplicitlySet("issued")) {
                this.issued(model.getIssued());
            }
            if (model.wasPropertyExplicitlySet("updated")) {
                this.updated(model.getUpdated());
            }
            if (model.wasPropertyExplicitlySet("advisoryType")) {
                this.advisoryType(model.getAdvisoryType());
            }
            if (model.wasPropertyExplicitlySet("relatedCves")) {
                this.relatedCves(model.getRelatedCves());
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

    /** Advisory name */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Advisory name
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** OCID for the Erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID for the Erratum.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** OCID for the Compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID for the Compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Summary description of the erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("synopsis")
    private final String synopsis;

    /**
     * Summary description of the erratum.
     *
     * @return the value
     */
    public String getSynopsis() {
        return synopsis;
    }

    /** date the erratum was issued */
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    private final String issued;

    /**
     * date the erratum was issued
     *
     * @return the value
     */
    public String getIssued() {
        return issued;
    }

    /** most recent date the erratum was updated */
    @com.fasterxml.jackson.annotation.JsonProperty("updated")
    private final String updated;

    /**
     * most recent date the erratum was updated
     *
     * @return the value
     */
    public String getUpdated() {
        return updated;
    }

    /** Type of the erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
    private final UpdateTypes advisoryType;

    /**
     * Type of the erratum.
     *
     * @return the value
     */
    public UpdateTypes getAdvisoryType() {
        return advisoryType;
    }

    /** list of CVEs applicable to this erratum */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
    private final java.util.List<String> relatedCves;

    /**
     * list of CVEs applicable to this erratum
     *
     * @return the value
     */
    public java.util.List<String> getRelatedCves() {
        return relatedCves;
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
        sb.append("ErratumSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", synopsis=").append(String.valueOf(this.synopsis));
        sb.append(", issued=").append(String.valueOf(this.issued));
        sb.append(", updated=").append(String.valueOf(this.updated));
        sb.append(", advisoryType=").append(String.valueOf(this.advisoryType));
        sb.append(", relatedCves=").append(String.valueOf(this.relatedCves));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
