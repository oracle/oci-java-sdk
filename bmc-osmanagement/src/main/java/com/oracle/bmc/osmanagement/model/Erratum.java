/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Erratum.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Erratum {
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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

        @com.fasterxml.jackson.annotation.JsonProperty("from")
        private String from;

        public Builder from(String from) {
            this.from = from;
            this.__explicitlySet__.add("from");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("solution")
        private String solution;

        public Builder solution(String solution) {
            this.solution = solution;
            this.__explicitlySet__.add("solution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("references")
        private String references;

        public Builder references(String references) {
            this.references = references;
            this.__explicitlySet__.add("references");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("affectedInstances")
        private java.util.List<Id> affectedInstances;

        public Builder affectedInstances(java.util.List<Id> affectedInstances) {
            this.affectedInstances = affectedInstances;
            this.__explicitlySet__.add("affectedInstances");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
        private java.util.List<String> relatedCves;

        public Builder relatedCves(java.util.List<String> relatedCves) {
            this.relatedCves = relatedCves;
            this.__explicitlySet__.add("relatedCves");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
        private java.util.List<Id> softwareSources;

        public Builder softwareSources(java.util.List<Id> softwareSources) {
            this.softwareSources = softwareSources;
            this.__explicitlySet__.add("softwareSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("packages")
        private java.util.List<SoftwarePackageSummary> packages;

        public Builder packages(java.util.List<SoftwarePackageSummary> packages) {
            this.packages = packages;
            this.__explicitlySet__.add("packages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Erratum build() {
            Erratum __instance__ =
                    new Erratum(
                            name,
                            id,
                            compartmentId,
                            synopsis,
                            issued,
                            description,
                            updated,
                            advisoryType,
                            from,
                            solution,
                            references,
                            affectedInstances,
                            relatedCves,
                            softwareSources,
                            packages);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Erratum o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .synopsis(o.getSynopsis())
                            .issued(o.getIssued())
                            .description(o.getDescription())
                            .updated(o.getUpdated())
                            .advisoryType(o.getAdvisoryType())
                            .from(o.getFrom())
                            .solution(o.getSolution())
                            .references(o.getReferences())
                            .affectedInstances(o.getAffectedInstances())
                            .relatedCves(o.getRelatedCves())
                            .softwareSources(o.getSoftwareSources())
                            .packages(o.getPackages());

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
     * Details describing the erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

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
     * Information specifying from where the erratum was release.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("from")
    String from;

    /**
     * Information describing how the erratum can be resolved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("solution")
    String solution;

    /**
     * Information describing how to find more information about the erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("references")
    String references;

    /**
     * list of managed instances  to this erratum
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("affectedInstances")
    java.util.List<Id> affectedInstances;

    /**
     * list of CVEs applicable to this erratum
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
    java.util.List<String> relatedCves;

    /**
     * list of Software Sources
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
    java.util.List<Id> softwareSources;

    /**
     * list of Packages affected by this erratum
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packages")
    java.util.List<SoftwarePackageSummary> packages;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
