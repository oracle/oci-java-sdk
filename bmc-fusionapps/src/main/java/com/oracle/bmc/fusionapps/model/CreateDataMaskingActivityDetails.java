/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * The information about current data masking request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDataMaskingActivityDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDataMaskingActivityDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isResumeDataMasking"})
    public CreateDataMaskingActivityDetails(Boolean isResumeDataMasking) {
        super();
        this.isResumeDataMasking = isResumeDataMasking;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This allows the Data Safe service to resume the previously failed data masking activity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isResumeDataMasking")
        private Boolean isResumeDataMasking;

        /**
         * This allows the Data Safe service to resume the previously failed data masking activity.
         * @param isResumeDataMasking the value to set
         * @return this builder
         **/
        public Builder isResumeDataMasking(Boolean isResumeDataMasking) {
            this.isResumeDataMasking = isResumeDataMasking;
            this.__explicitlySet__.add("isResumeDataMasking");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataMaskingActivityDetails build() {
            CreateDataMaskingActivityDetails model =
                    new CreateDataMaskingActivityDetails(this.isResumeDataMasking);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataMaskingActivityDetails model) {
            if (model.wasPropertyExplicitlySet("isResumeDataMasking")) {
                this.isResumeDataMasking(model.getIsResumeDataMasking());
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
     * This allows the Data Safe service to resume the previously failed data masking activity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isResumeDataMasking")
    private final Boolean isResumeDataMasking;

    /**
     * This allows the Data Safe service to resume the previously failed data masking activity.
     * @return the value
     **/
    public Boolean getIsResumeDataMasking() {
        return isResumeDataMasking;
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
        sb.append("CreateDataMaskingActivityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isResumeDataMasking=").append(String.valueOf(this.isResumeDataMasking));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDataMaskingActivityDetails)) {
            return false;
        }

        CreateDataMaskingActivityDetails other = (CreateDataMaskingActivityDetails) o;
        return java.util.Objects.equals(this.isResumeDataMasking, other.isResumeDataMasking)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isResumeDataMasking == null
                                ? 43
                                : this.isResumeDataMasking.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
