/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Details about the erratum.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Erratum.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Erratum extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "id",
        "compartmentId",
        "synopsis",
        "issued",
        "description",
        "updated",
        "advisoryType",
        "from",
        "solution",
        "references",
        "affectedInstances",
        "relatedCves",
        "softwareSources",
        "packages"
    })
    public Erratum(
            String name,
            String id,
            String compartmentId,
            String synopsis,
            String issued,
            String description,
            String updated,
            UpdateTypes advisoryType,
            String from,
            String solution,
            String references,
            java.util.List<Id> affectedInstances,
            java.util.List<String> relatedCves,
            java.util.List<Id> softwareSources,
            java.util.List<SoftwarePackageSummary> packages) {
        super();
        this.name = name;
        this.id = id;
        this.compartmentId = compartmentId;
        this.synopsis = synopsis;
        this.issued = issued;
        this.description = description;
        this.updated = updated;
        this.advisoryType = advisoryType;
        this.from = from;
        this.solution = solution;
        this.references = references;
        this.affectedInstances = affectedInstances;
        this.relatedCves = relatedCves;
        this.softwareSources = softwareSources;
        this.packages = packages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Advisory name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Advisory name
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * OCID for the Erratum.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID for the Erratum.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * OCID for the Compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID for the Compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Summary description of the erratum.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("synopsis")
        private String synopsis;

        /**
         * Summary description of the erratum.
         * @param synopsis the value to set
         * @return this builder
         **/
        public Builder synopsis(String synopsis) {
            this.synopsis = synopsis;
            this.__explicitlySet__.add("synopsis");
            return this;
        }
        /**
         * date the erratum was issued
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("issued")
        private String issued;

        /**
         * date the erratum was issued
         * @param issued the value to set
         * @return this builder
         **/
        public Builder issued(String issued) {
            this.issued = issued;
            this.__explicitlySet__.add("issued");
            return this;
        }
        /**
         * Details describing the erratum.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Details describing the erratum.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * most recent date the erratum was updated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updated")
        private String updated;

        /**
         * most recent date the erratum was updated
         * @param updated the value to set
         * @return this builder
         **/
        public Builder updated(String updated) {
            this.updated = updated;
            this.__explicitlySet__.add("updated");
            return this;
        }
        /**
         * Type of the erratum.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
        private UpdateTypes advisoryType;

        /**
         * Type of the erratum.
         * @param advisoryType the value to set
         * @return this builder
         **/
        public Builder advisoryType(UpdateTypes advisoryType) {
            this.advisoryType = advisoryType;
            this.__explicitlySet__.add("advisoryType");
            return this;
        }
        /**
         * Information specifying from where the erratum was release.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("from")
        private String from;

        /**
         * Information specifying from where the erratum was release.
         * @param from the value to set
         * @return this builder
         **/
        public Builder from(String from) {
            this.from = from;
            this.__explicitlySet__.add("from");
            return this;
        }
        /**
         * Information describing how the erratum can be resolved.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("solution")
        private String solution;

        /**
         * Information describing how the erratum can be resolved.
         * @param solution the value to set
         * @return this builder
         **/
        public Builder solution(String solution) {
            this.solution = solution;
            this.__explicitlySet__.add("solution");
            return this;
        }
        /**
         * Information describing how to find more information about the erratum.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("references")
        private String references;

        /**
         * Information describing how to find more information about the erratum.
         * @param references the value to set
         * @return this builder
         **/
        public Builder references(String references) {
            this.references = references;
            this.__explicitlySet__.add("references");
            return this;
        }
        /**
         * list of managed instances  to this erratum
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("affectedInstances")
        private java.util.List<Id> affectedInstances;

        /**
         * list of managed instances  to this erratum
         * @param affectedInstances the value to set
         * @return this builder
         **/
        public Builder affectedInstances(java.util.List<Id> affectedInstances) {
            this.affectedInstances = affectedInstances;
            this.__explicitlySet__.add("affectedInstances");
            return this;
        }
        /**
         * list of CVEs applicable to this erratum
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
        private java.util.List<String> relatedCves;

        /**
         * list of CVEs applicable to this erratum
         * @param relatedCves the value to set
         * @return this builder
         **/
        public Builder relatedCves(java.util.List<String> relatedCves) {
            this.relatedCves = relatedCves;
            this.__explicitlySet__.add("relatedCves");
            return this;
        }
        /**
         * list of Software Sources
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
        private java.util.List<Id> softwareSources;

        /**
         * list of Software Sources
         * @param softwareSources the value to set
         * @return this builder
         **/
        public Builder softwareSources(java.util.List<Id> softwareSources) {
            this.softwareSources = softwareSources;
            this.__explicitlySet__.add("softwareSources");
            return this;
        }
        /**
         * list of Packages affected by this erratum
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packages")
        private java.util.List<SoftwarePackageSummary> packages;

        /**
         * list of Packages affected by this erratum
         * @param packages the value to set
         * @return this builder
         **/
        public Builder packages(java.util.List<SoftwarePackageSummary> packages) {
            this.packages = packages;
            this.__explicitlySet__.add("packages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Erratum build() {
            Erratum model =
                    new Erratum(
                            this.name,
                            this.id,
                            this.compartmentId,
                            this.synopsis,
                            this.issued,
                            this.description,
                            this.updated,
                            this.advisoryType,
                            this.from,
                            this.solution,
                            this.references,
                            this.affectedInstances,
                            this.relatedCves,
                            this.softwareSources,
                            this.packages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Erratum model) {
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
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("updated")) {
                this.updated(model.getUpdated());
            }
            if (model.wasPropertyExplicitlySet("advisoryType")) {
                this.advisoryType(model.getAdvisoryType());
            }
            if (model.wasPropertyExplicitlySet("from")) {
                this.from(model.getFrom());
            }
            if (model.wasPropertyExplicitlySet("solution")) {
                this.solution(model.getSolution());
            }
            if (model.wasPropertyExplicitlySet("references")) {
                this.references(model.getReferences());
            }
            if (model.wasPropertyExplicitlySet("affectedInstances")) {
                this.affectedInstances(model.getAffectedInstances());
            }
            if (model.wasPropertyExplicitlySet("relatedCves")) {
                this.relatedCves(model.getRelatedCves());
            }
            if (model.wasPropertyExplicitlySet("softwareSources")) {
                this.softwareSources(model.getSoftwareSources());
            }
            if (model.wasPropertyExplicitlySet("packages")) {
                this.packages(model.getPackages());
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

    /**
     * Advisory name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Advisory name
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * OCID for the Erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID for the Erratum.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * OCID for the Compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID for the Compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Summary description of the erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("synopsis")
    private final String synopsis;

    /**
     * Summary description of the erratum.
     * @return the value
     **/
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * date the erratum was issued
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    private final String issued;

    /**
     * date the erratum was issued
     * @return the value
     **/
    public String getIssued() {
        return issued;
    }

    /**
     * Details describing the erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Details describing the erratum.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * most recent date the erratum was updated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updated")
    private final String updated;

    /**
     * most recent date the erratum was updated
     * @return the value
     **/
    public String getUpdated() {
        return updated;
    }

    /**
     * Type of the erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
    private final UpdateTypes advisoryType;

    /**
     * Type of the erratum.
     * @return the value
     **/
    public UpdateTypes getAdvisoryType() {
        return advisoryType;
    }

    /**
     * Information specifying from where the erratum was release.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("from")
    private final String from;

    /**
     * Information specifying from where the erratum was release.
     * @return the value
     **/
    public String getFrom() {
        return from;
    }

    /**
     * Information describing how the erratum can be resolved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("solution")
    private final String solution;

    /**
     * Information describing how the erratum can be resolved.
     * @return the value
     **/
    public String getSolution() {
        return solution;
    }

    /**
     * Information describing how to find more information about the erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("references")
    private final String references;

    /**
     * Information describing how to find more information about the erratum.
     * @return the value
     **/
    public String getReferences() {
        return references;
    }

    /**
     * list of managed instances  to this erratum
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("affectedInstances")
    private final java.util.List<Id> affectedInstances;

    /**
     * list of managed instances  to this erratum
     * @return the value
     **/
    public java.util.List<Id> getAffectedInstances() {
        return affectedInstances;
    }

    /**
     * list of CVEs applicable to this erratum
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
    private final java.util.List<String> relatedCves;

    /**
     * list of CVEs applicable to this erratum
     * @return the value
     **/
    public java.util.List<String> getRelatedCves() {
        return relatedCves;
    }

    /**
     * list of Software Sources
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
    private final java.util.List<Id> softwareSources;

    /**
     * list of Software Sources
     * @return the value
     **/
    public java.util.List<Id> getSoftwareSources() {
        return softwareSources;
    }

    /**
     * list of Packages affected by this erratum
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packages")
    private final java.util.List<SoftwarePackageSummary> packages;

    /**
     * list of Packages affected by this erratum
     * @return the value
     **/
    public java.util.List<SoftwarePackageSummary> getPackages() {
        return packages;
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
        sb.append("Erratum(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", synopsis=").append(String.valueOf(this.synopsis));
        sb.append(", issued=").append(String.valueOf(this.issued));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", updated=").append(String.valueOf(this.updated));
        sb.append(", advisoryType=").append(String.valueOf(this.advisoryType));
        sb.append(", from=").append(String.valueOf(this.from));
        sb.append(", solution=").append(String.valueOf(this.solution));
        sb.append(", references=").append(String.valueOf(this.references));
        sb.append(", affectedInstances=").append(String.valueOf(this.affectedInstances));
        sb.append(", relatedCves=").append(String.valueOf(this.relatedCves));
        sb.append(", softwareSources=").append(String.valueOf(this.softwareSources));
        sb.append(", packages=").append(String.valueOf(this.packages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Erratum)) {
            return false;
        }

        Erratum other = (Erratum) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.synopsis, other.synopsis)
                && java.util.Objects.equals(this.issued, other.issued)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.updated, other.updated)
                && java.util.Objects.equals(this.advisoryType, other.advisoryType)
                && java.util.Objects.equals(this.from, other.from)
                && java.util.Objects.equals(this.solution, other.solution)
                && java.util.Objects.equals(this.references, other.references)
                && java.util.Objects.equals(this.affectedInstances, other.affectedInstances)
                && java.util.Objects.equals(this.relatedCves, other.relatedCves)
                && java.util.Objects.equals(this.softwareSources, other.softwareSources)
                && java.util.Objects.equals(this.packages, other.packages)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.updated == null ? 43 : this.updated.hashCode());
        result = (result * PRIME) + (this.advisoryType == null ? 43 : this.advisoryType.hashCode());
        result = (result * PRIME) + (this.from == null ? 43 : this.from.hashCode());
        result = (result * PRIME) + (this.solution == null ? 43 : this.solution.hashCode());
        result = (result * PRIME) + (this.references == null ? 43 : this.references.hashCode());
        result =
                (result * PRIME)
                        + (this.affectedInstances == null ? 43 : this.affectedInstances.hashCode());
        result = (result * PRIME) + (this.relatedCves == null ? 43 : this.relatedCves.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSources == null ? 43 : this.softwareSources.hashCode());
        result = (result * PRIME) + (this.packages == null ? 43 : this.packages.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
