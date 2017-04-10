package com.mvpotter.kladrapi.request.wrapper;

import com.mvpotter.kladrapi.request.AbstractRequest;
import com.mvpotter.kladrapi.request.Request;
import com.mvpotter.kladrapi.request.TypeCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * KLADR request wrapper that adds type code.
 */
public class RequestWithTypeCode extends AbstractRequest {

    public static final String PARAM_TYPE_CODE = "typeCode";

    /**
     * Constructor.
     *
     * @param request original request
     * @param typeCodes required type codes
     */
    public RequestWithTypeCode(final Request request, final TypeCode... typeCodes) {
        super(request.toMap());
        if (typeCodes.length == 0) {
            throw new IllegalArgumentException("No type code provided");
        }
        final Set<TypeCode> uniqueTypeCodes = new HashSet<>(Arrays.asList(typeCodes));
        int requiredTypeCode = 0;
        for (final TypeCode typeCode: uniqueTypeCodes) {
            requiredTypeCode |= typeCode.getCode();
        }
        map.put(PARAM_TYPE_CODE, String.valueOf(requiredTypeCode));
    }

}
