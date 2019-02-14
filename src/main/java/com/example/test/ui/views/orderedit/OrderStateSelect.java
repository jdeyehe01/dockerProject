package com.example.test.ui.views.orderedit;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;
import com.example.test.app.HasLogger;
import com.example.test.backend.data.OrderState;
import com.vaadin.ui.ComboBox;

@SpringComponent
@ViewScope
public class OrderStateSelect extends ComboBox<OrderState> implements HasLogger {

	public OrderStateSelect() {
		setEmptySelectionAllowed(false);
		setTextInputAllowed(false);
		setItems(OrderState.values());
		setItemCaptionGenerator(OrderState::getDisplayName);
	}

}
