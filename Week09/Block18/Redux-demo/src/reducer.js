const initialState = {
  fName: "Mowglee",
  lName: "Patel",
  address: "Chicago, IL",
  counter: 100
};

const reducer = (state = initialState, action) => {
  console.log(action);

  if (action.type == "INCREMENT") {
    return { ...state, counter: state.counter + action.payload };
  }
  if (action.type == "DECREMENT") {
    return { ...state, counter: state.counter - 1 };
  }

  return state;
};

export default reducer;
