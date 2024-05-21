/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The Functions task.
 * Batch input for a function can be limited by either size or time. The first limit reached determines the boundary of the batch.
 * For configuration instructions, see
 * [Creating a Connector](https://docs.cloud.oracle.com/iaas/Content/connector-hub/create-service-connector.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FunctionTaskDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FunctionTaskDetails extends TaskDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the function to be used as a task.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("functionId")
        private String functionId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the function to be used as a task.
         *
         * @param functionId the value to set
         * @return this builder
         **/
        public Builder functionId(String functionId) {
            this.functionId = functionId;
            this.__explicitlySet__.add("functionId");
            return this;
        }
        /**
         * Size limit (kilobytes) for batch sent to invoke the function.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("batchSizeInKbs")
        private Integer batchSizeInKbs;

        /**
         * Size limit (kilobytes) for batch sent to invoke the function.
         *
         * @param batchSizeInKbs the value to set
         * @return this builder
         **/
        public Builder batchSizeInKbs(Integer batchSizeInKbs) {
            this.batchSizeInKbs = batchSizeInKbs;
            this.__explicitlySet__.add("batchSizeInKbs");
            return this;
        }
        /**
         * Time limit (seconds) for batch sent to invoke the function.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("batchTimeInSec")
        private Integer batchTimeInSec;

        /**
         * Time limit (seconds) for batch sent to invoke the function.
         *
         * @param batchTimeInSec the value to set
         * @return this builder
         **/
        public Builder batchTimeInSec(Integer batchTimeInSec) {
            this.batchTimeInSec = batchTimeInSec;
            this.__explicitlySet__.add("batchTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FunctionTaskDetails build() {
            FunctionTaskDetails model =
                    new FunctionTaskDetails(
                            this.functionId, this.batchSizeInKbs, this.batchTimeInSec);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FunctionTaskDetails model) {
            if (model.wasPropertyExplicitlySet("functionId")) {
                this.functionId(model.getFunctionId());
            }
            if (model.wasPropertyExplicitlySet("batchSizeInKbs")) {
                this.batchSizeInKbs(model.getBatchSizeInKbs());
            }
            if (model.wasPropertyExplicitlySet("batchTimeInSec")) {
                this.batchTimeInSec(model.getBatchTimeInSec());
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
    public FunctionTaskDetails(String functionId, Integer batchSizeInKbs, Integer batchTimeInSec) {
        super();
        this.functionId = functionId;
        this.batchSizeInKbs = batchSizeInKbs;
        this.batchTimeInSec = batchTimeInSec;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the function to be used as a task.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionId")
    private final String functionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the function to be used as a task.
     *
     * @return the value
     **/
    public String getFunctionId() {
        return functionId;
    }

    /**
     * Size limit (kilobytes) for batch sent to invoke the function.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchSizeInKbs")
    private final Integer batchSizeInKbs;

    /**
     * Size limit (kilobytes) for batch sent to invoke the function.
     *
     * @return the value
     **/
    public Integer getBatchSizeInKbs() {
        return batchSizeInKbs;
    }

    /**
     * Time limit (seconds) for batch sent to invoke the function.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchTimeInSec")
    private final Integer batchTimeInSec;

    /**
     * Time limit (seconds) for batch sent to invoke the function.
     *
     * @return the value
     **/
    public Integer getBatchTimeInSec() {
        return batchTimeInSec;
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
        sb.append("FunctionTaskDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", functionId=").append(String.valueOf(this.functionId));
        sb.append(", batchSizeInKbs=").append(String.valueOf(this.batchSizeInKbs));
        sb.append(", batchTimeInSec=").append(String.valueOf(this.batchTimeInSec));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FunctionTaskDetails)) {
            return false;
        }

        FunctionTaskDetails other = (FunctionTaskDetails) o;
        return java.util.Objects.equals(this.functionId, other.functionId)
                && java.util.Objects.equals(this.batchSizeInKbs, other.batchSizeInKbs)
                && java.util.Objects.equals(this.batchTimeInSec, other.batchTimeInSec)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.functionId == null ? 43 : this.functionId.hashCode());
        result =
                (result * PRIME)
                        + (this.batchSizeInKbs == null ? 43 : this.batchSizeInKbs.hashCode());
        result =
                (result * PRIME)
                        + (this.batchTimeInSec == null ? 43 : this.batchTimeInSec.hashCode());
        return result;
    }
}
