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

package models

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	strfmt "github.com/go-openapi/strfmt"

	"github.com/go-openapi/errors"
	"github.com/go-openapi/validate"
)

// TaskNetworkBindingModel task network binding model
// swagger:model TaskNetworkBindingModel
type TaskNetworkBindingModel struct {

	// bind IP
	// Required: true
	BindIP *string `json:"bindIP"`

	// container port
	// Required: true
	ContainerPort *int64 `json:"containerPort"`

	// host port
	// Required: true
	HostPort *int64 `json:"hostPort"`

	// protocol
	Protocol string `json:"protocol,omitempty"`
}

// Validate validates this task network binding model
func (m *TaskNetworkBindingModel) Validate(formats strfmt.Registry) error {
	var res []error

	if err := m.validateBindIP(formats); err != nil {
		// prop
		res = append(res, err)
	}

	if err := m.validateContainerPort(formats); err != nil {
		// prop
		res = append(res, err)
	}

	if err := m.validateHostPort(formats); err != nil {
		// prop
		res = append(res, err)
	}

	if len(res) > 0 {
		return errors.CompositeValidationError(res...)
	}
	return nil
}

func (m *TaskNetworkBindingModel) validateBindIP(formats strfmt.Registry) error {

	if err := validate.Required("bindIP", "body", m.BindIP); err != nil {
		return err
	}

	return nil
}

func (m *TaskNetworkBindingModel) validateContainerPort(formats strfmt.Registry) error {

	if err := validate.Required("containerPort", "body", m.ContainerPort); err != nil {
		return err
	}

	return nil
}

func (m *TaskNetworkBindingModel) validateHostPort(formats strfmt.Registry) error {

	if err := validate.Required("hostPort", "body", m.HostPort); err != nil {
		return err
	}

	return nil
}
