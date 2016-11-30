// Copyright 2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License"). You may
// not use this file except in compliance with the License. A copy of the
// License is located at
//
//     http://aws.amazon.com/apache2.0/
//
// or in the "license" file accompanying this file. This file is distributed
// on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
// express or implied. See the License for the specific language governing
// permissions and limitations under the License.

// Automatically generated by MockGen. DO NOT EDIT!
// Source: net/http (interfaces: RoundTripper)

package mocks

import (
	http "net/http"

	gomock "github.com/golang/mock/gomock"
)

// Mock of RoundTripper interface
type MockRoundTripper struct {
	ctrl     *gomock.Controller
	recorder *_MockRoundTripperRecorder
}

// Recorder for MockRoundTripper (not exported)
type _MockRoundTripperRecorder struct {
	mock *MockRoundTripper
}

func NewMockRoundTripper(ctrl *gomock.Controller) *MockRoundTripper {
	mock := &MockRoundTripper{ctrl: ctrl}
	mock.recorder = &_MockRoundTripperRecorder{mock}
	return mock
}

func (_m *MockRoundTripper) EXPECT() *_MockRoundTripperRecorder {
	return _m.recorder
}

func (_m *MockRoundTripper) RoundTrip(_param0 *http.Request) (*http.Response, error) {
	ret := _m.ctrl.Call(_m, "RoundTrip", _param0)
	ret0, _ := ret[0].(*http.Response)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

func (_mr *_MockRoundTripperRecorder) RoundTrip(arg0 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "RoundTrip", arg0)
}
