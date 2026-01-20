/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for a user-defined step in a DR plan. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "stepType",
        defaultImpl = DrPlanUserDefinedStep.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InvokeFunctionUserDefinedCustomPrecheckStep.class,
            name = "INVOKE_FUNCTION_USER_DEFINED_CUSTOM_PRECHECK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InvokeFunctionStep.class,
            name = "INVOKE_FUNCTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InvokeFunctionPrecheckStep.class,
            name = "INVOKE_FUNCTION_PRECHECK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RunObjectStoreScriptUserDefinedCustomPrecheckStep.class,
            name = "RUN_OBJECTSTORE_SCRIPT_USER_DEFINED_CUSTOM_PRECHECK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RunLocalScriptUserDefinedStep.class,
            name = "RUN_LOCAL_SCRIPT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LocalScriptPrecheckStep.class,
            name = "RUN_LOCAL_SCRIPT_PRECHECK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ObjectStoreScriptPrecheckStep.class,
            name = "RUN_OBJECTSTORE_SCRIPT_PRECHECK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RunLocalScriptUserDefinedCustomPrecheckStep.class,
            name = "RUN_LOCAL_SCRIPT_USER_DEFINED_CUSTOM_PRECHECK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RunObjectStoreScriptUserDefinedStep.class,
            name = "RUN_OBJECTSTORE_SCRIPT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DrPlanUserDefinedStep
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected DrPlanUserDefinedStep() {
        super();
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
        sb.append("DrPlanUserDefinedStep(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrPlanUserDefinedStep)) {
            return false;
        }

        DrPlanUserDefinedStep other = (DrPlanUserDefinedStep) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of the user-defined step.
     *
     * <p>*RUN_OBJECTSTORE_SCRIPT_PRECHECK** - A built-in step which performs a precheck on a script
     * stored in OCI object storage. This step cannot be added, deleted, or customized by the user.
     *
     * <p>*RUN_LOCAL_SCRIPT_PRECHECK** - A built-in step which performs a precheck on a script which
     * resides locally on a compute instance. This step cannot be added, deleted, or customized by
     * the user.
     *
     * <p>*INVOKE_FUNCTION_PRECHECK** - A built-in step which performs a precheck on an OCI
     * function. This step cannot be added, deleted, or customized by the user. See
     * https://docs.oracle.com/en-us/iaas/Content/Functions/home.htm.
     *
     * <p>*RUN_OBJECTSTORE_SCRIPT** - A step which runs a script stored in OCI object storage.
     *
     * <p>*RUN_LOCAL_SCRIPT** - A step which runs a script that resides locally on a compute
     * instance.
     *
     * <p>*INVOKE_FUNCTION** - A step which invokes an OCI function. See
     * https://docs.oracle.com/en-us/iaas/Content/Functions/home.htm.
     *
     * <p>*RUN_OBJECTSTORE_SCRIPT_USER_DEFINED_CUSTOM_PRECHECK** - A user-defined step which
     * performs a precheck by executing a user-provided script stored in OCI object storage.
     *
     * <p>*RUN_LOCAL_SCRIPT_USER_DEFINED_CUSTOM_PRECHECK** - A user-defined step which performs a
     * precheck by executing a user-provided script which resides locally on a compute instance.
     *
     * <p>*INVOKE_FUNCTION_USER_DEFINED_CUSTOM_PRECHECK** - A user-defined step which performs a
     * precheck by executing a user-provided OCI function. See
     * https://docs.oracle.com/en-us/iaas/Content/Functions/home.htm.
     */
    public enum StepType implements com.oracle.bmc.http.internal.BmcEnum {
        RunObjectstoreScriptPrecheck("RUN_OBJECTSTORE_SCRIPT_PRECHECK"),
        RunLocalScriptPrecheck("RUN_LOCAL_SCRIPT_PRECHECK"),
        InvokeFunctionPrecheck("INVOKE_FUNCTION_PRECHECK"),
        RunObjectstoreScript("RUN_OBJECTSTORE_SCRIPT"),
        RunLocalScript("RUN_LOCAL_SCRIPT"),
        InvokeFunction("INVOKE_FUNCTION"),
        RunObjectstoreScriptUserDefinedCustomPrecheck(
                "RUN_OBJECTSTORE_SCRIPT_USER_DEFINED_CUSTOM_PRECHECK"),
        RunLocalScriptUserDefinedCustomPrecheck("RUN_LOCAL_SCRIPT_USER_DEFINED_CUSTOM_PRECHECK"),
        InvokeFunctionUserDefinedCustomPrecheck("INVOKE_FUNCTION_USER_DEFINED_CUSTOM_PRECHECK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(StepType.class);

        private final String value;
        private static java.util.Map<String, StepType> map;

        static {
            map = new java.util.HashMap<>();
            for (StepType v : StepType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StepType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StepType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StepType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
