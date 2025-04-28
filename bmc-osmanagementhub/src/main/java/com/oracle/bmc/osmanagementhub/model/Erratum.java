/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * An object that defines an erratum.. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Erratum.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Erratum extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "synopsis",
        "timeIssued",
        "description",
        "timeUpdated",
        "classificationType",
        "advisoryType",
        "from",
        "solution",
        "references",
        "relatedCves",
        "repositories",
        "packages",
        "osFamilies",
        "advisorySeverity"
    })
    public Erratum(
            String name,
            String synopsis,
            java.util.Date timeIssued,
            String description,
            java.util.Date timeUpdated,
            ClassificationTypes classificationType,
            AdvisoryTypes advisoryType,
            String from,
            String solution,
            String references,
            java.util.List<String> relatedCves,
            java.util.List<String> repositories,
            java.util.List<SoftwarePackageSummary> packages,
            java.util.List<OsFamily> osFamilies,
            AdvisorySeverity advisorySeverity) {
        super();
        this.name = name;
        this.synopsis = synopsis;
        this.timeIssued = timeIssued;
        this.description = description;
        this.timeUpdated = timeUpdated;
        this.classificationType = classificationType;
        this.advisoryType = advisoryType;
        this.from = from;
        this.solution = solution;
        this.references = references;
        this.relatedCves = relatedCves;
        this.repositories = repositories;
        this.packages = packages;
        this.osFamilies = osFamilies;
        this.advisorySeverity = advisorySeverity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Advisory name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Advisory name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
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
        /**
         * The date and time the erratum was issued (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeIssued")
        private java.util.Date timeIssued;

        /**
         * The date and time the erratum was issued (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeIssued the value to set
         * @return this builder
         */
        public Builder timeIssued(java.util.Date timeIssued) {
            this.timeIssued = timeIssued;
            this.__explicitlySet__.add("timeIssued");
            return this;
        }
        /** Details describing the erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Details describing the erratum.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The date and time the erratum was updated (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the erratum was updated (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Type of the erratum. This property is deprecated and it will be removed in a future API
         * release. Please refer to the advisoryType property instead.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("classificationType")
        private ClassificationTypes classificationType;

        /**
         * Type of the erratum. This property is deprecated and it will be removed in a future API
         * release. Please refer to the advisoryType property instead.
         *
         * @param classificationType the value to set
         * @return this builder
         */
        public Builder classificationType(ClassificationTypes classificationType) {
            this.classificationType = classificationType;
            this.__explicitlySet__.add("classificationType");
            return this;
        }
        /** The advisory type of the erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
        private AdvisoryTypes advisoryType;

        /**
         * The advisory type of the erratum.
         *
         * @param advisoryType the value to set
         * @return this builder
         */
        public Builder advisoryType(AdvisoryTypes advisoryType) {
            this.advisoryType = advisoryType;
            this.__explicitlySet__.add("advisoryType");
            return this;
        }
        /** Information specifying from where the erratum was release. */
        @com.fasterxml.jackson.annotation.JsonProperty("from")
        private String from;

        /**
         * Information specifying from where the erratum was release.
         *
         * @param from the value to set
         * @return this builder
         */
        public Builder from(String from) {
            this.from = from;
            this.__explicitlySet__.add("from");
            return this;
        }
        /** Information describing how the erratum can be resolved. */
        @com.fasterxml.jackson.annotation.JsonProperty("solution")
        private String solution;

        /**
         * Information describing how the erratum can be resolved.
         *
         * @param solution the value to set
         * @return this builder
         */
        public Builder solution(String solution) {
            this.solution = solution;
            this.__explicitlySet__.add("solution");
            return this;
        }
        /** Information describing how to find more information about. the erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("references")
        private String references;

        /**
         * Information describing how to find more information about. the erratum.
         *
         * @param references the value to set
         * @return this builder
         */
        public Builder references(String references) {
            this.references = references;
            this.__explicitlySet__.add("references");
            return this;
        }
        /** List of CVEs applicable to this erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
        private java.util.List<String> relatedCves;

        /**
         * List of CVEs applicable to this erratum.
         *
         * @param relatedCves the value to set
         * @return this builder
         */
        public Builder relatedCves(java.util.List<String> relatedCves) {
            this.relatedCves = relatedCves;
            this.__explicitlySet__.add("relatedCves");
            return this;
        }
        /** List of repository identifiers. */
        @com.fasterxml.jackson.annotation.JsonProperty("repositories")
        private java.util.List<String> repositories;

        /**
         * List of repository identifiers.
         *
         * @param repositories the value to set
         * @return this builder
         */
        public Builder repositories(java.util.List<String> repositories) {
            this.repositories = repositories;
            this.__explicitlySet__.add("repositories");
            return this;
        }
        /** List of packages affected by this erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("packages")
        private java.util.List<SoftwarePackageSummary> packages;

        /**
         * List of packages affected by this erratum.
         *
         * @param packages the value to set
         * @return this builder
         */
        public Builder packages(java.util.List<SoftwarePackageSummary> packages) {
            this.packages = packages;
            this.__explicitlySet__.add("packages");
            return this;
        }
        /** List of affected OS families. */
        @com.fasterxml.jackson.annotation.JsonProperty("osFamilies")
        private java.util.List<OsFamily> osFamilies;

        /**
         * List of affected OS families.
         *
         * @param osFamilies the value to set
         * @return this builder
         */
        public Builder osFamilies(java.util.List<OsFamily> osFamilies) {
            this.osFamilies = osFamilies;
            this.__explicitlySet__.add("osFamilies");
            return this;
        }
        /** The severity for a security advisory, otherwise, null. */
        @com.fasterxml.jackson.annotation.JsonProperty("advisorySeverity")
        private AdvisorySeverity advisorySeverity;

        /**
         * The severity for a security advisory, otherwise, null.
         *
         * @param advisorySeverity the value to set
         * @return this builder
         */
        public Builder advisorySeverity(AdvisorySeverity advisorySeverity) {
            this.advisorySeverity = advisorySeverity;
            this.__explicitlySet__.add("advisorySeverity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Erratum build() {
            Erratum model =
                    new Erratum(
                            this.name,
                            this.synopsis,
                            this.timeIssued,
                            this.description,
                            this.timeUpdated,
                            this.classificationType,
                            this.advisoryType,
                            this.from,
                            this.solution,
                            this.references,
                            this.relatedCves,
                            this.repositories,
                            this.packages,
                            this.osFamilies,
                            this.advisorySeverity);
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
            if (model.wasPropertyExplicitlySet("synopsis")) {
                this.synopsis(model.getSynopsis());
            }
            if (model.wasPropertyExplicitlySet("timeIssued")) {
                this.timeIssued(model.getTimeIssued());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("classificationType")) {
                this.classificationType(model.getClassificationType());
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
            if (model.wasPropertyExplicitlySet("relatedCves")) {
                this.relatedCves(model.getRelatedCves());
            }
            if (model.wasPropertyExplicitlySet("repositories")) {
                this.repositories(model.getRepositories());
            }
            if (model.wasPropertyExplicitlySet("packages")) {
                this.packages(model.getPackages());
            }
            if (model.wasPropertyExplicitlySet("osFamilies")) {
                this.osFamilies(model.getOsFamilies());
            }
            if (model.wasPropertyExplicitlySet("advisorySeverity")) {
                this.advisorySeverity(model.getAdvisorySeverity());
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

    /** Advisory name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Advisory name.
     *
     * @return the value
     */
    public String getName() {
        return name;
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

    /**
     * The date and time the erratum was issued (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeIssued")
    private final java.util.Date timeIssued;

    /**
     * The date and time the erratum was issued (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     *
     * @return the value
     */
    public java.util.Date getTimeIssued() {
        return timeIssued;
    }

    /** Details describing the erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Details describing the erratum.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The date and time the erratum was updated (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the erratum was updated (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Type of the erratum. This property is deprecated and it will be removed in a future API
     * release. Please refer to the advisoryType property instead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("classificationType")
    private final ClassificationTypes classificationType;

    /**
     * Type of the erratum. This property is deprecated and it will be removed in a future API
     * release. Please refer to the advisoryType property instead.
     *
     * @return the value
     */
    public ClassificationTypes getClassificationType() {
        return classificationType;
    }

    /** The advisory type of the erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
    private final AdvisoryTypes advisoryType;

    /**
     * The advisory type of the erratum.
     *
     * @return the value
     */
    public AdvisoryTypes getAdvisoryType() {
        return advisoryType;
    }

    /** Information specifying from where the erratum was release. */
    @com.fasterxml.jackson.annotation.JsonProperty("from")
    private final String from;

    /**
     * Information specifying from where the erratum was release.
     *
     * @return the value
     */
    public String getFrom() {
        return from;
    }

    /** Information describing how the erratum can be resolved. */
    @com.fasterxml.jackson.annotation.JsonProperty("solution")
    private final String solution;

    /**
     * Information describing how the erratum can be resolved.
     *
     * @return the value
     */
    public String getSolution() {
        return solution;
    }

    /** Information describing how to find more information about. the erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("references")
    private final String references;

    /**
     * Information describing how to find more information about. the erratum.
     *
     * @return the value
     */
    public String getReferences() {
        return references;
    }

    /** List of CVEs applicable to this erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
    private final java.util.List<String> relatedCves;

    /**
     * List of CVEs applicable to this erratum.
     *
     * @return the value
     */
    public java.util.List<String> getRelatedCves() {
        return relatedCves;
    }

    /** List of repository identifiers. */
    @com.fasterxml.jackson.annotation.JsonProperty("repositories")
    private final java.util.List<String> repositories;

    /**
     * List of repository identifiers.
     *
     * @return the value
     */
    public java.util.List<String> getRepositories() {
        return repositories;
    }

    /** List of packages affected by this erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("packages")
    private final java.util.List<SoftwarePackageSummary> packages;

    /**
     * List of packages affected by this erratum.
     *
     * @return the value
     */
    public java.util.List<SoftwarePackageSummary> getPackages() {
        return packages;
    }

    /** List of affected OS families. */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamilies")
    private final java.util.List<OsFamily> osFamilies;

    /**
     * List of affected OS families.
     *
     * @return the value
     */
    public java.util.List<OsFamily> getOsFamilies() {
        return osFamilies;
    }

    /** The severity for a security advisory, otherwise, null. */
    @com.fasterxml.jackson.annotation.JsonProperty("advisorySeverity")
    private final AdvisorySeverity advisorySeverity;

    /**
     * The severity for a security advisory, otherwise, null.
     *
     * @return the value
     */
    public AdvisorySeverity getAdvisorySeverity() {
        return advisorySeverity;
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
        sb.append("Erratum(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", synopsis=").append(String.valueOf(this.synopsis));
        sb.append(", timeIssued=").append(String.valueOf(this.timeIssued));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", classificationType=").append(String.valueOf(this.classificationType));
        sb.append(", advisoryType=").append(String.valueOf(this.advisoryType));
        sb.append(", from=").append(String.valueOf(this.from));
        sb.append(", solution=").append(String.valueOf(this.solution));
        sb.append(", references=").append(String.valueOf(this.references));
        sb.append(", relatedCves=").append(String.valueOf(this.relatedCves));
        sb.append(", repositories=").append(String.valueOf(this.repositories));
        sb.append(", packages=").append(String.valueOf(this.packages));
        sb.append(", osFamilies=").append(String.valueOf(this.osFamilies));
        sb.append(", advisorySeverity=").append(String.valueOf(this.advisorySeverity));
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
                && java.util.Objects.equals(this.synopsis, other.synopsis)
                && java.util.Objects.equals(this.timeIssued, other.timeIssued)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.classificationType, other.classificationType)
                && java.util.Objects.equals(this.advisoryType, other.advisoryType)
                && java.util.Objects.equals(this.from, other.from)
                && java.util.Objects.equals(this.solution, other.solution)
                && java.util.Objects.equals(this.references, other.references)
                && java.util.Objects.equals(this.relatedCves, other.relatedCves)
                && java.util.Objects.equals(this.repositories, other.repositories)
                && java.util.Objects.equals(this.packages, other.packages)
                && java.util.Objects.equals(this.osFamilies, other.osFamilies)
                && java.util.Objects.equals(this.advisorySeverity, other.advisorySeverity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.synopsis == null ? 43 : this.synopsis.hashCode());
        result = (result * PRIME) + (this.timeIssued == null ? 43 : this.timeIssued.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.classificationType == null
                                ? 43
                                : this.classificationType.hashCode());
        result = (result * PRIME) + (this.advisoryType == null ? 43 : this.advisoryType.hashCode());
        result = (result * PRIME) + (this.from == null ? 43 : this.from.hashCode());
        result = (result * PRIME) + (this.solution == null ? 43 : this.solution.hashCode());
        result = (result * PRIME) + (this.references == null ? 43 : this.references.hashCode());
        result = (result * PRIME) + (this.relatedCves == null ? 43 : this.relatedCves.hashCode());
        result = (result * PRIME) + (this.repositories == null ? 43 : this.repositories.hashCode());
        result = (result * PRIME) + (this.packages == null ? 43 : this.packages.hashCode());
        result = (result * PRIME) + (this.osFamilies == null ? 43 : this.osFamilies.hashCode());
        result =
                (result * PRIME)
                        + (this.advisorySeverity == null ? 43 : this.advisorySeverity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
