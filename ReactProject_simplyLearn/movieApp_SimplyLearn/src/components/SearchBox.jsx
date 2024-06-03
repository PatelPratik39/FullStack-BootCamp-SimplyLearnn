import React from "react";

const SearchBox = (props) => {
  return (
    <div className="col-sm-4">
      <input
        className="form-control"
        placeholder="Search Movies ...."
        value={props.value}
        onChange={(e) => props.setSearchValue(e.target.value)}
      />
    </div>
  );
};

export default SearchBox;
