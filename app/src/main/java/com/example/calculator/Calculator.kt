package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.LightGray
import com.example.calculator.ui.theme.MediumGray
import com.example.calculator.ui.theme.Pink

@Composable
fun Calculator(
    state: CalcState,
    buttonSpacing: Dp = 8.dp,
    modifier: Modifier = Modifier,
    onEvents: (CalcEvents) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 40.sp,
                color = Color.White,
                maxLines = 2
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorBtn(
                    symbol = "AC",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(2f).weight(2f),
                    onClick = {
                        onEvents(CalcEvents.Clear)
                    }
                )

                CalculatorBtn(
                    symbol = "Del",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Delete)
                    }
                )
                CalculatorBtn(
                    symbol = "/",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Operation(CalcOperation.Divide))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorBtn(
                    symbol = "7",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Number(7))
                    }
                )

                CalculatorBtn(
                    symbol = "8",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Number(8))
                    }
                )
                CalculatorBtn(
                    symbol = "9",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Number(9))
                    }
                )
                CalculatorBtn(
                    symbol = "x",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Operation(CalcOperation.Multiply))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorBtn(
                    symbol = "4",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Number(4))
                    }
                )

                CalculatorBtn(
                    symbol = "5",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Number(5))
                    }
                )
                CalculatorBtn(
                    symbol = "6",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Number(6))
                    }
                )
                CalculatorBtn(
                    symbol = "-",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Operation(CalcOperation.Subtract))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorBtn(
                    symbol = "1",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Number(1))
                    }
                )

                CalculatorBtn(
                    symbol = "2",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Number(2))
                    }
                )
                CalculatorBtn(
                    symbol = "3",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Number(3))
                    }
                )
                CalculatorBtn(
                    symbol = "+",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Operation(CalcOperation.Add))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorBtn(
                    symbol = "0",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(2f).weight(2f),
                    onClick = {
                        onEvents(CalcEvents.Number(0))
                    }
                )

                CalculatorBtn(
                    symbol = ".",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Decimal)
                    }
                )

                CalculatorBtn(
                    symbol = "=",
                    modifier = Modifier
                        .background(Pink)
                        .aspectRatio(1f).weight(1f),
                    onClick = {
                        onEvents(CalcEvents.Calculate)
                    }
                )
            }
        }
    }
}