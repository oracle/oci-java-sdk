/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The compartment target of the alarm suppression.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AlarmSuppressionCompartmentTarget.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "targetType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AlarmSuppressionCompartmentTarget extends AlarmSuppressionTarget {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment or tenancy that is the
         * target of the alarm suppression.
         * Example: {@code ocid1.compartment.oc1..exampleuniqueID}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment or tenancy that is the
         * target of the alarm suppression.
         * Example: {@code ocid1.compartment.oc1..exampleuniqueID}
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * When true, the alarm suppression targets all alarms under all compartments and subcompartments of
         * the tenancy specified. The parameter can only be set to true when compartmentId is the tenancy OCID
         * (the tenancy is the root compartment). When false, the alarm suppression targets only the alarms under
         * the specified compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
        private Boolean compartmentIdInSubtree;

        /**
         * When true, the alarm suppression targets all alarms under all compartments and subcompartments of
         * the tenancy specified. The parameter can only be set to true when compartmentId is the tenancy OCID
         * (the tenancy is the root compartment). When false, the alarm suppression targets only the alarms under
         * the specified compartment.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder
         **/
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            this.__explicitlySet__.add("compartmentIdInSubtree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlarmSuppressionCompartmentTarget build() {
            AlarmSuppressionCompartmentTarget model =
                    new AlarmSuppressionCompartmentTarget(
                            this.compartmentId, this.compartmentIdInSubtree);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlarmSuppressionCompartmentTarget model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("compartmentIdInSubtree")) {
                this.compartmentIdInSubtree(model.getCompartmentIdInSubtree());
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

    @Deprecated
    public AlarmSuppressionCompartmentTarget(String compartmentId, Boolean compartmentIdInSubtree) {
        super();
        this.compartmentId = compartmentId;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment or tenancy that is the
     * target of the alarm suppression.
     * Example: {@code ocid1.compartment.oc1..exampleuniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment or tenancy that is the
     * target of the alarm suppression.
     * Example: {@code ocid1.compartment.oc1..exampleuniqueID}
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * When true, the alarm suppression targets all alarms under all compartments and subcompartments of
     * the tenancy specified. The parameter can only be set to true when compartmentId is the tenancy OCID
     * (the tenancy is the root compartment). When false, the alarm suppression targets only the alarms under
     * the specified compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
    private final Boolean compartmentIdInSubtree;

    /**
     * When true, the alarm suppression targets all alarms under all compartments and subcompartments of
     * the tenancy specified. The parameter can only be set to true when compartmentId is the tenancy OCID
     * (the tenancy is the root compartment). When false, the alarm suppression targets only the alarms under
     * the specified compartment.
     *
     * @return the value
     **/
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
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
        sb.append("AlarmSuppressionCompartmentTarget(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlarmSuppressionCompartmentTarget)) {
            return false;
        }

        AlarmSuppressionCompartmentTarget other = (AlarmSuppressionCompartmentTarget) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        return result;
    }
}
