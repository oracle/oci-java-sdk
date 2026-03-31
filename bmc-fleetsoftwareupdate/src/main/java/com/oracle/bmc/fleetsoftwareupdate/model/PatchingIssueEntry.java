/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Patching issue found during an Exadata Fleet Update Readiness Check run.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PatchingIssueEntry.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PatchingIssueEntry extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "impactedResourceId",
        "recommendedAction"
    })
    public PatchingIssueEntry(
            String name, String description, String impactedResourceId, String recommendedAction) {
        super();
        this.name = name;
        this.description = description;
        this.impactedResourceId = impactedResourceId;
        this.recommendedAction = recommendedAction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the patching issue.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the patching issue.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Description of the patching issue.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the patching issue.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource impacted by the patching issue.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("impactedResourceId")
        private String impactedResourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource impacted by the patching issue.
         *
         * @param impactedResourceId the value to set
         * @return this builder
         **/
        public Builder impactedResourceId(String impactedResourceId) {
            this.impactedResourceId = impactedResourceId;
            this.__explicitlySet__.add("impactedResourceId");
            return this;
        }
        /**
         * Recommended action to perform to address or further triage the patching issue.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendedAction")
        private String recommendedAction;

        /**
         * Recommended action to perform to address or further triage the patching issue.
         *
         * @param recommendedAction the value to set
         * @return this builder
         **/
        public Builder recommendedAction(String recommendedAction) {
            this.recommendedAction = recommendedAction;
            this.__explicitlySet__.add("recommendedAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchingIssueEntry build() {
            PatchingIssueEntry model =
                    new PatchingIssueEntry(
                            this.name,
                            this.description,
                            this.impactedResourceId,
                            this.recommendedAction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchingIssueEntry model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("impactedResourceId")) {
                this.impactedResourceId(model.getImpactedResourceId());
            }
            if (model.wasPropertyExplicitlySet("recommendedAction")) {
                this.recommendedAction(model.getRecommendedAction());
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
     * Name of the patching issue.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the patching issue.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Description of the patching issue.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the patching issue.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource impacted by the patching issue.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("impactedResourceId")
    private final String impactedResourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource impacted by the patching issue.
     *
     * @return the value
     **/
    public String getImpactedResourceId() {
        return impactedResourceId;
    }

    /**
     * Recommended action to perform to address or further triage the patching issue.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedAction")
    private final String recommendedAction;

    /**
     * Recommended action to perform to address or further triage the patching issue.
     *
     * @return the value
     **/
    public String getRecommendedAction() {
        return recommendedAction;
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
        sb.append("PatchingIssueEntry(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", impactedResourceId=").append(String.valueOf(this.impactedResourceId));
        sb.append(", recommendedAction=").append(String.valueOf(this.recommendedAction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchingIssueEntry)) {
            return false;
        }

        PatchingIssueEntry other = (PatchingIssueEntry) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.impactedResourceId, other.impactedResourceId)
                && java.util.Objects.equals(this.recommendedAction, other.recommendedAction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.impactedResourceId == null
                                ? 43
                                : this.impactedResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedAction == null ? 43 : this.recommendedAction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
